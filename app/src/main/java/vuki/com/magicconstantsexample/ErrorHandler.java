package vuki.com.magicconstantsexample;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

/**
 * Created by mvukosav on 15.7.2016..
 */
public final class ErrorHandler {

    /**
     * Method for displaying alert dialog for given error code
     *
     * @param context   - context of calling activity
     * @param errorCode - code for given error
     */
    public static void reportError( Context context, @ErrorCode String errorCode ) {

        switch( errorCode ) {
            case ErrorCode.NETWORK_CONNECTION_ERROR:
                showErrorDialog( context, "reproduction.disabled_on_3g.error.title", "reproduction.disabled_on_3g.error.message", "common.button.ok" );
                break;
            case ErrorCode.GEO_BLOCKING:
                showErrorDialog( context, "error.geoblocking.title", "error.geoblocking.message", "common.button.ok" );
                break;
            default:
                Log.e( "Error code", "Error code is: " + errorCode );
                break;
        }
    }

    private static void showErrorDialog( Context context, String title, String message, String positiveButtonMsg ) {
        AlertDialog.Builder adBuilder = new AlertDialog.Builder( context )
                .setTitle( title )
                .setMessage( message )
                .setPositiveButton( positiveButtonMsg, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick( DialogInterface dialog, int which ) {
                        dialog.dismiss();
                    }
                } );

        AlertDialog alert = adBuilder.create();
        alert.show();
    }

}
