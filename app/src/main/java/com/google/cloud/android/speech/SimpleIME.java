package com.google.cloud.android.speech;


import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.AudioManager;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;

public class SimpleIME extends InputMethodService
        implements KeyboardView.OnKeyboardActionListener{

    //KEYBOARD VARIABLES
    private KeyboardView kv;
    private Keyboard keyboard;
    private boolean caps = false;
    private final int KEYBOARD_LEFT=100004;
    private final int KEYBOARD_RIGHT=100003;
    private final int KEYBOARD_RECORD=100002;
    private final int KEYBOARD_CONFIRM=100001;
    private final int KEYBOARD_REJECT=100000;

    //SPEECH-TO-TEXT VARIABLES
    private SpeechService mSpeechService;
    private VoiceRecorder mVoiceRecorder;
    private String buffer;

    //TEXT-TO-SPEECH VARIABLES
    private final String CONFIRM ="Do you confirm the text output?";
    private TextToSpeech mTTS;
    private final int DATA_CHECK_CODE=0;

    //=======================================================================
    //SPEECH-TO-TEXT FUNCTIONS
    //=======================================================================
    private final ServiceConnection mServiceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder binder) {
            Log.d("STT","Keyboard class onServiceConnected");
            mSpeechService = SpeechService.from(binder);
            mSpeechService.addListener(mSpeechServiceListener);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("STT","Keyboard class onServiceDisconnected");
            mSpeechService = null;
        }

    };

    private final VoiceRecorder.Callback mVoiceCallback = new VoiceRecorder.Callback() {

        @Override
        public void onVoiceStart() {
            if (mSpeechService != null) {
                Log.d("STT","Keyboard class onVoiceStart");
                mSpeechService.startRecognizing(mVoiceRecorder.getSampleRate());
            }
        }

        @Override
        public void onVoice(byte[] data, int size) {
            if (mSpeechService != null) {
                mSpeechService.recognize(data, size);
            }
        }

        @Override
        public void onVoiceEnd() {
            if (mSpeechService != null) {
                Log.d("STT","Keyboard class onVoiceEnd");
                mSpeechService.finishRecognizing();
            }
        }

    };

    private final SpeechService.Listener mSpeechServiceListener =
            new SpeechService.Listener() {
                @Override
                public void onSpeechRecognized(final String text, final boolean isFinal) {
                    InputConnection ic =getCurrentInputConnection();
                    Log.d("STT","Keyboard class speech service listener isFinal value: "+isFinal);
                    if(!TextUtils.isEmpty(text)&&isFinal){
                        ic.commitText(text+". ",1);
                        Log.d("STT","Keyboard class speech service listener VoiceRecorder dismiss");
                        mVoiceRecorder.dismiss();
                        SimpleIME.this.stopVoiceRecorder();
                    }
                }
            };

    private void startVoiceRecorder() {
        Log.d("STT","Voice recording started");
        if (mVoiceRecorder != null) {
            mVoiceRecorder.stop();
        }
        mVoiceRecorder = new VoiceRecorder(mVoiceCallback);
        mVoiceRecorder.start();
    }

    private void stopVoiceRecorder() {
        Log.d("STT","Voice recording stopped");
        if (mVoiceRecorder != null) {
            mVoiceRecorder.stop();
            mVoiceRecorder = null;
        }
    }

    //=======================================================================
    //KEYBOARD FUNCTIONS
    //=======================================================================

    @Override
    public View onCreateInputView() {
        kv = (KeyboardView)getLayoutInflater().inflate(R.layout.keyboard, null);
        keyboard = new Keyboard(this, R.xml.qwerty);
        kv.setKeyboard(keyboard);
        kv.setOnKeyboardActionListener(this);
        bindService(new Intent(this, SpeechService.class), mServiceConnection, BIND_AUTO_CREATE);
        startVoiceRecorder();
        Log.d("STT","Keyboard class createInputView");
        return kv;
    }

    @Override
    public void onStartInputView(EditorInfo info,boolean restarting){
        Log.d("STT","Keyboard class startInputView");
        Log.d("STT","Info: "+info);
        Log.d("STT","Restarting: "+restarting);
        startVoiceRecorder();

    }

    private void playClick(int keyCode){
        AudioManager am = (AudioManager)getSystemService(AUDIO_SERVICE);
        switch(keyCode){
            default: am.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
        }
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {

        playClick(primaryCode);
        switch(primaryCode){
            case KEYBOARD_RECORD :
                startVoiceRecorder();
                break;
            case KEYBOARD_RIGHT:
                break;
            case KEYBOARD_LEFT:
                break;
            case KEYBOARD_CONFIRM:
                break;
            case KEYBOARD_REJECT:
                break;
            default:
        }
    }

    @Override
    public void onPress(int primaryCode) {
    }

    @Override
    public void onRelease(int primaryCode) {
    }

    @Override
    public void onText(CharSequence text) {
    }

    @Override
    public void swipeDown() {
    }

    @Override
    public void swipeLeft() {
    }

    @Override
    public void swipeRight() {
    }

    @Override
    public void swipeUp() {
    }




}
