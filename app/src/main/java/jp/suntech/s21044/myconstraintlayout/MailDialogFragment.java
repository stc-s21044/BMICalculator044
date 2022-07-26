package jp.suntech.s21044.myconstraintlayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;



public class MailDialogFragment extends DialogFragment {
        @Override
        public android.app.Dialog onCreateDialog(Bundle savedInstanceState){

            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());

            builder.setTitle(R.string.dialog_title);
            builder.setMessage(R.string.dialog_mes);
            builder.setPositiveButton(R.string.dialog_ok,new DialogButtonClickListener());

            AlertDialog dialog=builder.create();
            return dialog;
        }


    private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog,int which){


        }


    }
}
