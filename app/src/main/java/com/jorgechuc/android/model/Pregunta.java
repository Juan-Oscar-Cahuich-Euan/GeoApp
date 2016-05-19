package com.jorgechuc.android.model;

/**
 * Created by juan_lio_lian on 19/05/2016.
 */
public class Pregunta {
    public int getldResTexto() {
        return mldResTexto;
    }

    public void setldResTexto(int mldResTexto) {
        this.mldResTexto = mldResTexto;
    }

    public boolean isRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }
    private int mldResTexto;
    private boolean mRespuestaVerdadera;

    public Pregunta(int mldResTexto, boolean mRespuestaVerdadera) {
        this.mldResTexto = mldResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

}