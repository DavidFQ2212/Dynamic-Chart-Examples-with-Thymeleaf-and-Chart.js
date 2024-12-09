package com.Grafics.Graficas.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGraficas {
    @GetMapping("/charts")
    public String showCharts(Model model) {
        // Datos para la gráfica de barras
        model.addAttribute("barLabels", List.of("Enero", "Febrero", "Marzo", "Abril", "Mayo"));
        model.addAttribute("barValues", List.of(10, 15, 8, 20, 12));

        // Datos para la gráfica de línea
        model.addAttribute("lineValues", List.of(5, 10, 15, 20, 25));

        // Datos para la gráfica de radar
        model.addAttribute("radarValues", List.of(5, 10, 15, 10, 5));

        // Datos para la gráfica de pastel
        model.addAttribute("pieValues", List.of(10, 20, 30, 25, 15));

        // Datos para la gráfica de burbujas (Bubble Chart)
        // Cada "burbuja" tiene coordenadas (x, y) y un radio (r) para representar su tamaño
        model.addAttribute("bubbleValues", List.of(
            Map.of("x", 10, "y", 15, "r", 10),
            Map.of("x", 15, "y", 10, "r", 15),
            Map.of("x", 20, "y", 20, "r", 20)
        ));

        // Datos para la gráfica de dispersión (Scatter Chart)
        // Cada punto tiene coordenadas (x, y)
        model.addAttribute("scatterValues", List.of(
            Map.of("x", 5, "y", 5),
            Map.of("x", 10, "y", 15),
            Map.of("x", 15, "y", 10),
            Map.of("x", 20, "y", 25)
        ));

        // Retornamos el nombre de la plantilla Thymeleaf para renderizar las gráficas
        return "charts";
    }

    
}
