package com.kun.hack4;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.widget.Toast;

/**
 * Created by mi on 16-6-6.
 */
public class EmailDialog extends DialogPreference {
    Context mContext;
    public EmailDialog(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
    }

    public EmailDialog(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public EmailDialog(Context context) {
        this(context,null);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        super.onClick(dialog, which);

        if(DialogInterface.BUTTON_POSITIVE==which)
        {
            Toast.makeText(mContext,"test",Toast.LENGTH_SHORT).show();
        }
    }
}
