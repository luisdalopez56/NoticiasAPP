package com.iesvirgendelcarmen.noticiasdeportes.Noticias;

import android.content.Context;

import com.iesvirgendelcarmen.noticiasdeportes.Modelo.Noticia;
import com.iesvirgendelcarmen.noticiasdeportes.modelos.NoticiasRepositorio;

import java.util.List;

public class NoticiasPresenter implements NoticiasContract.Presentador{

    NoticiasContract.Vista vista;


    public NoticiasPresenter(NoticiasContract.Vista vista) {

        this.vista = vista;
    }


    @Override
    public void cargarNoticias(Context context) {
        NoticiasRepositorio.getInstance().cargarNoticias(context, new NoticiasRepositorio.Callback() {
            @Override
            public void onNoticiasCargadas(List<Noticia> noticias) {
                vista.mostrarNoticias(noticias);
            }
        });
    }
}
