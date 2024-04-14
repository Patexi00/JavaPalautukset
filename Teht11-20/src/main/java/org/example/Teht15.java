package org.example;

public class Teht15 {
    private static Teht15 Musiikkisoitin;
    private String biisi;
    private Teht15(){

    }

    public static Teht15 LuoSoitin(){           //Mikäli instanssia ei ole luotu tehdään sellainen ja jos on palautetaan aikaisemmin luotu instanssi.
        if(Musiikkisoitin == null){
            Musiikkisoitin = new Teht15();
        }
        return Musiikkisoitin;
    }

    public void setTrack(String _biisi){                //"Asettaa" biisin
        biisi = _biisi;
    }
    public void playTrack(){                            //"Soitaa" biisin
        if(biisi != null){
            System.out.println("Soitetaan: " + biisi);
        }else{
            System.out.println("Biisiä ei valittu");
        }
    }
}
