package br.com.etechoracio.pw3viagens.Entity;

import br.com.etechoracio.pw3viagens.Enum.CategoriaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter

public class Gastos {

    @JoinColumn(name="ID_GASTO")
    @ManyToOne
    private Viagem Id;

    @Column(name="TX_DESCRICAO")
    private String Descricao;

    @Column(name="TX_LOCAL")
    private String Local;

    @Column(name="TP_CATEGORIA")
    @Enumerated(EnumType.STRING)
    private CategoriaEnum tipoCategoria;

    @Column(name="DT_GASTO")
    private LocalDate dataGasto;

    @Column(name="VLR_GASTO")
    private double valorGasto;

    // Fabia e Allan


}
