package GUI;

import civitas.CivitasJuego;
import civitas.OperacionesJuego;
import GUI.Respuestas;
import civitas.OperacionInmobiliaria;
import civitas.GestionesInmobiliarias;
import civitas.SalidasCarcel;

public class Controlador {
     
    //Atributos de instancia
    private CivitasJuego juego;
    private CivitasView vista;
    
    //Constructor
    Controlador(CivitasJuego juego, CivitasView vista){
        this.juego = juego;
        this.vista = vista;
    }
    
    
    void juega(){
        
        //Mostrar el estado del juego actualizado
        vista.setCivitasJuego(juego);
        Boolean continuar = !juego.finalDelJuego();
        
        while(continuar){
            
            //Muestro el estado actual del juego
            vista.actualizarVista();
            
            //Mostrar la siguiente operacion y si no es pasar turno diario
            OperacionesJuego operacion = juego.siguientePaso();
            vista.mostrarSiguienteOperacion(operacion);
            
            if (operacion != OperacionesJuego.PASAR_TURNO)
                vista.mostrarEventos();
            else
                vista.pausaCambioTurno();
            
            //Pregunto si es el final del juego
                //Sí --> continuar = false
                //No --> genero la operacion
            continuar = !juego.finalDelJuego();
            Respuestas resp;
            
            if (continuar){
                switch (operacion) {
                    case COMPRAR:
                        resp = vista.comprar();
                        if (resp == Respuestas.SI){
                            juego.comprar();
                        }
                        juego.siguientePasoCompletado(operacion);
     
                        break;
                    
                    case GESTIONAR:
                        vista.gestionar(juego.getJugadorActual());
                        
                        //Obtengo la gestion inmobiliaria
                        int igestion = vista.getGestion(); 
                        int ipropiedad = vista.getPropiedad();
                        
                        GestionesInmobiliarias gestion = 
                                    GestionesInmobiliarias.values()[igestion];
                        
                        //Si la gestión elegida es TERMINAR se llama a sig oper
                        switch (gestion){
                            case VENDER:
                                juego.vender(ipropiedad);
                                break;
                                
                            case HIPOTECAR:
                                juego.hipotecar(ipropiedad);
                                break;
                                
                            case CANCELAR_HIPOTECA:
                                juego.cancelarHipoteca(ipropiedad);
                                break;
                                
                            case CONSTRUIR_CASA:
                                juego.construirCasa(ipropiedad);
                                break;
                                
                            case CONSTRUIR_HOTEL:
                                juego.construirHotel(ipropiedad);
                                break;
                                
                            case TERMINAR:
                                juego.siguientePasoCompletado(operacion);
                                break;
                        }
                        
                        break; //gestionar
                    
                    case SALIR_CARCEL:
                        SalidasCarcel tipoSalida;
                        tipoSalida = vista.salirCarcel();
                        
                        if (tipoSalida == SalidasCarcel.PAGANDO)
                            juego.salirCarcelPagando();
                            
                        else 
                            juego.salirCarcelTirando();
                        
                        
                        juego.siguientePasoCompletado(operacion);
                        
                        break;
                
                } //realizando la operacion
                        
            }//si continuo es porque debo realizar una operacion
        }//while(continuar) --> jugando
    }
    
}

