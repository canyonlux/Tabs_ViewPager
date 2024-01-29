
package com.example.tablayout_viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Fragment3 es una clase que extiende de {@link Fragment}. Esta clase se utiliza para
 * representar una sección o vista dentro de una actividad. Es responsable de inflar la
 * interfaz de usuario del fragmento y gestionar su contenido.
 *
 * <p>Este fragmento se puede utilizar en conjunto con componentes como
 * {@link androidx.viewpager2.widget.ViewPager2} para proporcionar una navegación fluida
 * entre diferentes secciones de una aplicación.</p>
 *
 * <p>El método {@code onCreateView} se encarga de inflar la vista del fragmento con
 * el layout definido en R.layout.fragment3.</p>
 *
 * @author Rubén
 */
public class Fragment3 extends Fragment {

    /**
     * Crea y retorna la vista jerárquica asociada con el fragmento. Este método infla
     * la vista del fragmento usando el inflador de layout proporcionado.
     *
     * @param inflater El LayoutInflater que se puede utilizar para inflar
     *                 cualquier vista en el fragmento.
     * @param container Si no es nulo, es el padre al que debe adjuntarse la vista del fragmento.
     *                  Generalmente debería ser nulo.
     * @param savedInstanceState Si no es nulo, este fragmento se está reconstruyendo
     *                           desde un estado guardado anteriormente.
     * @return Retorna la vista para la interfaz de usuario del fragmento, o nulo.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment3, container, false);
    }
}

