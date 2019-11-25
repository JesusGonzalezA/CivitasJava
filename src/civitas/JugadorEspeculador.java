/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civitas;

/**
 *
 * @author jesus
 */
public class JugadorEspeculador extends Jugador{
    
    //-------------------------------------------------
    //Atributos
    private static final int FactorEspeculador = 2;
    private float fianza;
    //-------------------------------------------------
    //Métodos
    
        //Contructor
    JugadorEspeculador(Jugador otro, float fianza){
        super(otro);
        this.fianza = fianza;
    }
    //------------------------------------
    
    @Override
    protected int getHotelesMax(){
        return HotelesMax*FactorEspeculador;
    }
    
    @Override
    protected int getCasasMax(){
        return CasasMax*FactorEspeculador;
    }

    @Override
    Boolean pagaImpuesto(float cantidad){
        Boolean pagado = false;
        cantidad = cantidad/FactorEspeculador;
        
        if (!isEncarcelado()){
            pagado = paga(cantidad);
        }
            
        return pagado;
    }
    
    @Override
    public String toString(){
        String representacion,tipo;
        
        tipo = "\t- JUGADOR ESPECULADOR\n";
        representacion = super.toString() + tipo;
        
        return representacion;
    }
    
    @Override
    protected Boolean debeSerEncarcelado(){
        Boolean debe = false;

        debe = super.debeSerEncarcelado();
        if (debe){      //No tiene salvoconducto
            if (fianza <= getSaldo()){      //Pago fianza para no ir
                debe = false;
                modificarSaldo(-fianza);
                
                //Informar a diario
                String evento = "El jugador " + getNombre() 
                             + " se libra de la cárcel mediante fianza";
                Diario.getInstance().OcurreEvento(evento);
            }
                
        }

        return debe;
    }

}