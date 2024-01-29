package com.example.tablayout_viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Fragment2 es una clase que extiende de {@link Fragment}, utilizada para mostrar
 * una lista de elementos en una vista de reciclaje (RecyclerView). Este fragmento
 * es responsable de configurar el RecyclerView, incluyendo su adaptador y la disposición
 * lineal de los elementos.
 *
 * <p>Este fragmento puede ser usado en una actividad para presentar una colección
 * de elementos, como imágenes o texto, en un formato horizontal desplazable.</p>
 *
 * <p>El método {@code onCreateView} infla el layout para este fragmento y configura
 * el RecyclerView con un {@link LinearLayoutManager} y un adaptador personalizado.</p>
 *
 * @author Rubén
 */
public class Fragment2 extends Fragment {

    private RecyclerView recyclerView;

    /**
     * Crea y retorna la vista jerárquica asociada con el fragmento.
     * Aquí se infla el layout del fragmento y se configura el RecyclerView.
     *
     * @param inflater El LayoutInflater que se puede utilizar para inflar
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
        View view = inflater.inflate(R.layout.fragment2, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // Array de IDs de imágenes en drawable
        int[] imageIds = {R.drawable.image1, R.drawable.image2, R.drawable.image3}; // Reemplaza con tus imágenes
        recyclerView.setAdapter(new ImageAdapter(getActivity(), imageIds));

        return view;
    }
}
