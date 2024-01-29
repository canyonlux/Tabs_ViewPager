package com.example.tablayout_viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Fragment1 es una clase que extiende {@link Fragment}, utilizada para representar
 * una sección o página en una actividad de la aplicación. Esta clase es responsable
 * de inflar la vista del fragmento y gestionar su ciclo de vida dentro de la interfaz de usuario.
 *
 * <p>Este fragmento está diseñado para ser parte de una actividad, usualmente
 * utilizada con un {@link androidx.viewpager2.widget.ViewPager2} y otros componentes de navegación
 * para permitir a los usuarios desplazarse entre diferentes secciones o páginas de la aplicación.</p>
 *
 * <p>El método {@code onCreateView} infla el layout definido en R.layout.fragment1
 * para este fragmento, estableciendo así su interfaz de usuario.</p>
 *
 * @author Rubén
 */
public class Fragment1 extends Fragment {

    /**
     * Crea y retorna la vista jerárquica asociada con el fragmento.
     * Aquí se infla el layout del fragmento utilizando el inflador de layout proporcionado.
     *
     * @param inflater El LayoutInflater objeto que se puede utilizar para inflar
     *                 cualquier vista en el fragmento.
     * @param container Si no es nulo, es el padre al que se debe adjuntar la vista del fragmento.
     *                  En la mayoría de los casos, debería ser nulo.
     * @param savedInstanceState Si no es nulo, este fragmento se está reconstruyendo
     *                           desde un estado guardado anteriormente.
     * @return Retorna la vista para la interfaz de usuario del fragmento, o nulo.
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}
