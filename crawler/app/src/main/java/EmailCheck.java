package com.example.playground;

import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }
}
