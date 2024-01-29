package com.example.tablayout_viewpager;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/**
 * Esta clase implementa un transformador de página personalizado para {@link ViewPager2}.
 * Aplica una rotación en el eje Y a las páginas del ViewPager2, basándose en su posición actual.
 * Esta transformación crea un efecto visual que puede mejorar la experiencia del usuario
 * al navegar entre las páginas del ViewPager2.
 *
 * <p>La rotación aplicada es proporcional a la posición de la página, lo que significa que
 * la rotación cambia dinámicamente a medida que el usuario desliza las páginas.</p>
 *
 * <p>Uso típico en conjunto con un {@link ViewPager2} para aplicar este efecto de transformación:</p>
 * <pre>
 *     viewPager2.setPageTransformer(new CustomPageTransformer());
 * </pre>
 *
 * @author Rubén
 */
public class CustomPageTransformer implements ViewPager2.PageTransformer {

    /**
     * Transforma la página dada aplicando una rotación en el eje Y.
     * La rotación aplicada es una función de la posición de la página.
     *
     * @param page La página a transformar.
     * @param position La posición de la página relativa al centro del ViewPager2.
     *                 El valor 0 indica que la página está en el centro, valores negativos
     *                 indican páginas a la izquierda, y valores positivos páginas a la derecha.
     */
    @Override
    public void transformPage(View page, float position) {
        page.setRotationY(position * -30); // Aplica una rotación en el eje Y basada en la posición.
    }
}
