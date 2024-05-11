package flight.demo.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dolar {

  private String moneda; 
  private String casa; 
  private String nombre;
  @Getter
  private double compra;
  @Getter
  private double venta;
  private LocalDateTime fechaActualizacion;

    public double getPromedio(){
        return((getCompra()+getVenta())/2);
    }

}
