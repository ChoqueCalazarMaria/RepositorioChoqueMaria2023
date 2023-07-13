package trabajos;

import java.util.Scanner;

/**
 *
 * @author FER
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        double sketch = 0, pintar = 0, detfinal = 0, keyframe, motion, libre = 0, tiempodig, tiempo = 0, tiempo1, tiempo2, tiempogrupal1, tiempogrupal2;
        int inciso, opcionextensa, fluidez, escenarios, personajes, personas, i,fram = 0,duracion;
        double p[];
        p = new double[100];
        System.out.println("¡Bienvenido!");
        System.out.println("El siguiente cuestionario fue creado con la misión de ayudarle a definir el tiempo que podría tardar en terminar su proyecto animado.Cada pregunta debera ser respondida con sus datos personales, por lo mismo, se le pide ser muy honesto con sus respuestas para conseguir resultados más exactos.");
        System.out.println("Con eso en cuenta, podemos comenzar. Escriba el número de la opción que se adapte más a usted.");
        System.out.println("¿Qué tipo de diagnóstico desea realizar?");
        System.out.println("1.Rápido pero menos preciso.");
        System.out.println("2.Lento pero más preciso.");
        Scanner teclado = new Scanner(System.in);
        do {
            inciso = teclado.nextInt();
            eleccion2op(inciso);
        } while (!(inciso < 3 && inciso > 0));
        System.out.println("Perfecto, a continuación responda las siguientes preguntas.");
        System.out.println("¿Duración de la animación que planea realizar? Responda en minutos.");
        duracion = teclado.nextInt();
        System.out.println("¿Qué tan fluido quiere que se el movimiento?");
        System.out.println("1.8 FPS");
        System.out.println("2.12 FPS");
        System.out.println("3.24 FPS");
        do {
            fluidez = teclado.nextInt();
            eleccion3op(fluidez);
        } while (!(fluidez <= 3 && fluidez >= 1));
        switch (fluidez) {
            case 1 ->
                fram = cantframes(duracion, 8);
            case 2 ->
                fram = cantframes(duracion, 12);
            case 3 ->
                fram = cantframes(duracion, 24);
            }
        if (inciso == 1) {
            System.out.println("¿Cuánto tarda en hacer un sketch? Responda en minutos.");
            sketch = teclado.nextDouble();
            System.out.println("¿Y en pintar? Responda en minutos.");
            pintar = teclado.nextDouble();
            System.out.println("¿En el lineart y detalles finales? Responda en minutos.");
            detfinal = teclado.nextDouble();
            tiempo = tiempoinicial(sketch, pintar,detfinal, fram);
        } else {
            System.out.println("¿Qué tipo de animación planea hacer?");
            System.out.println("1.Animación Tradicional");
            System.out.println("2.Animación 2D");
            System.out.println("3.Animación 3D");
            System.out.println("4.Animación Tipográfica (Área de marketing)");
            System.out.println("5.Animación Stop Motion");
            do {
                inciso = teclado.nextInt();
                if (inciso == 1 || inciso == 2 || inciso == 4) {
                    System.out.println("¿Cuánto tarda en hacer un sketch? Responda en minutos.");
                    sketch = teclado.nextDouble();
                    System.out.println("¿Y en pintar? Responda en minutos.");
                    pintar = teclado.nextDouble();
                    System.out.println("¿En el lineart y detalles finales? Responda en minutos.");
                    detfinal = teclado.nextDouble();
                }
                switch (inciso) {
                    case 1 ->
                        tiempo = tiempoinicial(sketch, pintar, detfinal, fram);
                    case 2 -> {
                        tiempo = tiempoinicial(sketch, pintar, detfinal, fram);
                        System.out.println("La animación será realizada en:");
                        System.out.println("1.Tableta Gráfica.");
                        System.out.println("2.Celular.");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion2op(opcionextensa);
                        } while (!(opcionextensa < 3 && opcionextensa > 0));
                        if (opcionextensa == 1) {
                            tiempo = tiempo - (tiempo * 15 / 100);
                        } else {
                            tiempo = tiempo + (tiempo * 8 / 100);
                        }
                        System.out.println("¿Tiene programas que le ayuden?");
                        System.out.println("1.Si.");
                        System.out.println("2.No.");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion2op(opcionextensa);
                        } while (!(opcionextensa < 3 && opcionextensa > 0));
                        if (opcionextensa == 1) {
                            tiempo = tiempo - (tiempo * 50 / 100);
                        } else {
                            tiempo = tiempo + (tiempo * 17 / 100);
                        }
                        System.out.println("Dibujará con:");
                        System.out.println("1.Lápiz Óptico.");
                        System.out.println("2.Dedo.");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion2op(opcionextensa);
                        } while (!(opcionextensa < 3 && opcionextensa > 0));
                        if (opcionextensa == 1) {
                            tiempo = tiempo - (tiempo * 5 / 100);
                        } else {
                            tiempo = tiempo + (tiempo * 23 / 100);
                        }
                    }
                    case 3 -> {
                        System.out.println("¿Cuánto tarda en realizar un patrón de movimiento por cada keyframe?");
                        keyframe = teclado.nextDouble();
                        tiempo = keyframe * fram;
                        System.out.println("¿Ya tiene modelado al personaje?");
                        System.out.println("1.Si.");
                        System.out.println("2.No.");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion2op(opcionextensa);
                        } while (!(opcionextensa < 3 && opcionextensa > 0));
                        if (opcionextensa == 2) {
                            tiempo = tiempo + 5000;
                            // Aproximadamente se tarda 80 horas en modelar un personaje sencillo en 3d. El valor esta convertido a minutos y se agregò el tiempo necesario para colocar las articulaciones al esqueleto del modelo.
                            System.out.println("¿Quiere que sea hiperrealista?");
                            System.out.println("1.Si.");
                            System.out.println("2.No.");
                            do {
                                opcionextensa = teclado.nextInt();
                                eleccion2op(opcionextensa);
                            } while (!(opcionextensa < 3 && opcionextensa > 0));
                            if (opcionextensa == 1) {
                                tiempo = tiempo + (tiempo * 56 / 100);
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("¿Que tipo de animación usará?");
                        System.out.println("1.2D");
                        System.out.println("2.3D");
                        System.out.println("3.Mixto");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion3op(opcionextensa);
                        } while (!(opcionextensa <= 3 && opcionextensa >= 1));
                        if (opcionextensa == 1) {
                            tiempo = tiempoinicial(sketch, pintar, detfinal, fram);
                            System.out.println("La animación será realizada en:");
                            System.out.println("1.Tableta Gráfica.");
                            System.out.println("2.Celular.");
                            do {
                                opcionextensa = teclado.nextInt();
                                eleccion2op(opcionextensa);
                            } while (!(opcionextensa < 3 && opcionextensa > 0));
                            if (opcionextensa == 1) {
                                tiempo = tiempo - (tiempo * 15 / 100);
                            } else {
                                tiempo = tiempo + (tiempo * 8 / 100);
                            }
                            System.out.println("¿Tiene programas que le ayuden?");
                            System.out.println("1.Si.");
                            System.out.println("2.No.");
                            do {
                                opcionextensa = teclado.nextInt();
                                eleccion2op(opcionextensa);
                            } while (!(opcionextensa < 3 && opcionextensa > 0));
                            if (opcionextensa == 1) {
                                tiempo = tiempo - (tiempo * 50 / 100);
                            } else {
                                tiempo = tiempo + (tiempo * 17 / 100);
                            }
                            System.out.println("Dibujará con:");
                            System.out.println("1.Lápiz Óptico.");
                            System.out.println("2.Dedo.");
                            do {
                                opcionextensa = teclado.nextInt();
                                eleccion2op(opcionextensa);
                            } while (!(opcionextensa < 3 && opcionextensa > 0));
                            if (opcionextensa == 1) {
                                tiempo = tiempo - (tiempo * 5 / 100);
                            } else {
                                tiempo = tiempo + (tiempo * 23 / 100);
                            }
                        } else {
                            if (opcionextensa == 2) {
                                System.out.println("¿Cuánto tarda en realizar un patrón de movimiento por cada keyframe?");
                                keyframe = teclado.nextDouble();
                                tiempo = keyframe * fram;
                                System.out.println("¿Ya tiene modelado al personajes");
                                System.out.println("1.Si.");
                                System.out.println("2.No.");
                                do {
                                    opcionextensa = teclado.nextInt();
                                    eleccion2op(opcionextensa);
                                } while (!(opcionextensa < 3 && opcionextensa > 0));
                                if (opcionextensa == 2) {
                                    tiempo = tiempo + 5000;
                                    System.out.println("¿Quiere que sea hiperrealista?");
                                    System.out.println("1.Si.");
                                    System.out.println("2.No.");
                                    do {
                                        opcionextensa = teclado.nextInt();
                                        eleccion2op(opcionextensa);
                                    } while (!(opcionextensa < 3 && opcionextensa > 0));
                                    if (opcionextensa == 1) {
                                        tiempo = tiempo + (tiempo * 56 / 100);
                                    }
                                }
                            } else {
                                tiempodig = tiempoinicial(sketch, pintar, detfinal, fram);
                                System.out.println("La animación será realizada en:");
                                System.out.println("1.Tableta Gráfica.");
                                System.out.println("2.Celular.");
                                do {
                                    opcionextensa = teclado.nextInt();
                                    eleccion2op(opcionextensa);
                                } while (!(opcionextensa < 3 && opcionextensa > 0));
                                if (opcionextensa == 1) {
                                    tiempodig = tiempodig - (tiempodig * 15 / 100);
                                } else {
                                    tiempodig = tiempodig + (tiempodig * 8 / 100);
                                }
                                System.out.println("¿Tiene programas que Le ayuden?");
                                System.out.println("1.Si.");
                                System.out.println("2.No.");
                                do {
                                    opcionextensa = teclado.nextInt();
                                    eleccion2op(opcionextensa);
                                } while (!(opcionextensa < 3 && opcionextensa > 0));
                                if (opcionextensa == 1) {
                                    tiempodig = tiempodig - (tiempodig * 50 / 100);
                                } else {
                                    tiempodig = tiempodig + (tiempodig * 17 / 100);
                                }
                                System.out.println("Dibujará con:");
                                System.out.println("1.Lápiz Optico.");
                                System.out.println("2.Dedo.");
                                do {
                                    opcionextensa = teclado.nextInt();
                                    eleccion2op(opcionextensa);
                                } while (!(opcionextensa < 3 && opcionextensa > 0));
                                if (opcionextensa == 1) {
                                    tiempodig = tiempodig - (tiempodig * 5 / 100);
                                } else {
                                    tiempodig = tiempodig + (tiempodig * 23 / 100);
                                }
                                System.out.println("¿Cuánto tarda en realizar un patrón de movimiento por cada keyframe?");
                                keyframe = teclado.nextDouble();
                                tiempo = keyframe * fram;
                                System.out.println("¿Ya tiene modelado al personaje?");
                                System.out.println("1.Si.");
                                System.out.println("2.No.");
                                do {
                                    opcionextensa = teclado.nextInt();
                                    eleccion2op(opcionextensa);
                                } while (!(opcionextensa < 3 && opcionextensa > 0));
                                if (opcionextensa == 2) {
                                    tiempo = tiempo + 5000;
                                    System.out.println("¿Quiere que sea hiperrealista?");
                                    System.out.println("1.Si.");
                                    System.out.println("2.No.");
                                    do {
                                        opcionextensa = teclado.nextInt();
                                        eleccion2op(opcionextensa);
                                    } while (!(opcionextensa < 3 && opcionextensa > 0));
                                    if (opcionextensa == 1) {
                                        tiempo = tiempo + (tiempo * 56 / 100);
                                    }
                                }
                                tiempo = (tiempo + tiempodig) / 2;
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("¿Cuánto tarda en posicionar correctamente las figuras?");
                        motion = teclado.nextDouble();
                        tiempo = motion * fram;
                        System.out.println("¿Tiene ya listo al personaje en físico?");
                        System.out.println("1.Si.");
                        System.out.println("2.No.");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion2op(opcionextensa);
                        } while (!(opcionextensa < 3 && opcionextensa > 0));
                        if (opcionextensa == 2) {
                            tiempo = tiempo + 50;
                            // 50 horas son las mínimas necesarias para crear una figura movible decente
                        }
                        System.out.println("¿Tiene ya listos los escenarios?");
                        System.out.println("1.Si.");
                        System.out.println("2.No.");
                        do {
                            opcionextensa = teclado.nextInt();
                            eleccion2op(opcionextensa);
                        } while (!(opcionextensa < 3 && opcionextensa > 0));
                        if (opcionextensa == 2) {
                            System.out.println("¿Cuantos escenarios planea hacer?");
                            escenarios = teclado.nextInt();
                            tiempo = tiempo + (80 * escenarios);
                            // Al igual que el personaje, modelar un escenario conlleva más tiempo
                        }
                    }
                    default ->
                        System.out.println("Por favor digite, el número correcto (entre 1 a 5)");
                }
            } while (!(inciso <= 5 && inciso >= 1));
        }
        System.out.println("¿La animación tendrá escenas de peleas o robots?");
        System.out.println("1.Si");
        System.out.println("2.No");
        do {
            inciso = teclado.nextInt();
            eleccion2op(inciso);
            if (inciso == 1) {
                tiempo = tiempo + (tiempo * 43 / 100);
                // El hecho de que exista una pelea o algún tipo de elemenro robótico en el proyecto incrementa en un 43% el tiempo de trabajo pues se pide más atención al detalle en estas escenas y/o personajes
            }
        } while (!(inciso < 3 && inciso > 0));
        System.out.println("¿Habra 2 o más personajes en el mismo frame?");
        System.out.println("1.Si");
        System.out.println("2.No");
        do {
            inciso = teclado.nextInt();
            eleccion2op(inciso);
        } while (!(inciso < 3 && inciso > 0));
        if (inciso == 1) {
            System.out.println("¿Cuántos?");
            personajes = teclado.nextInt();
            tiempo = tiempo + (tiempo * personajes / 10);
            // El tiempo se incrementa porcentualemente en realición a cuantos personajes estarán dibujados al mismo tiempo
        }
        System.out.println("¿Cuántas personas trabajaran en el proyecto?");
        personas = teclado.nextInt();
        eleccion2op(inciso);
        if (personas > 1) {
            for (i = 1; i <= personas; i++) {
                System.out.println("Artista número " + i + " ¿Cuánto tiempo dedicará por día para avanzar con la animación? Responda en horas.");
                p[i] = teclado.nextInt();
            }
        } else {
            System.out.println("¿Cuánto tiempo dedicará por día para avanzar con la animación? Responda en horas.");
            libre = teclado.nextDouble();
        }
        tiempo1 = tiempo * 1 / 60;
        System.out.println("Y aquí termina el diagnóstico.");
        System.out.println("El tiempo que usted tardaría para hacer su animación es de: " + tiempo1 + " horas.");
        if (personas > 1) {
            tiempogrupal1 = tiempo1 / personas;
            System.out.println("Como el trabajo se repartirá entre " + personas + " personas, entonces la carga horaria de cada participante sería de " + tiempogrupal1 + ".");
            for (i = 1; i <= personas; i++) {
                tiempogrupal2 = tiempogrupal1 * 1 / p[i];
                System.out.println("Artista número " + i + " necesitaria de " + tiempogrupal2 + " días para terminar su parte.");
            }
        } else {
            tiempo2 = tiempo1 * 1 / libre;
            System.out.println("Teniendo en cuenta que usted trabajaría " + libre + " horas por día, esto se traduce a un total de: " + tiempo2 + " días de trabajo.");
        }
        System.out.println("La cantidad de frames que necesita es de: " + fram);
        System.out.println("Esperamos que este diagnóstico le haya sido útil. Hasta una próxima ocasión.");
        System.out.println("¡Adios! Suerte con su proyecto.");
    }

    public static int cantframes(int d, int fr) {
        int f;
        f = (d * 60) * fr;
        return f;
    }

    public static double tiempoinicial(double inicio, double desarrollo, double detalles, double frame) {
        double t;
        t = (inicio + desarrollo + detalles) * frame;
        return t;
    }

    public static void eleccion2op(int x) {
        if (x != 1 && x != 2) {
            System.out.println("Por favor, seleccione una de las opciones (Escriba 1 o 2)");
        }
    }

    public static void eleccion3op(int x) {
        if (x < 1 || x > 3) {
            System.out.println("Por favor, seleccione una de las opciones (Escriba 1,2 o 3)");
        }
    }

}
