package hangman.model;


import org.junit.Assert;
import org.junit.Test;

import hangman.MultiplosDeCinco;
import hangman.MultiplosDeTres;

public class MultiplosTest {
    @Test
    public void MultiplosDeTres_siEsMultiplo_Fizz(){
        //Arrage
        MultiplosDeTres numero = new MultiplosDeTres();
        //Act
        String result = numero.siEsMultiplo(12);
        //Assert
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void MultiplosDeCinco_siEsMultiplo_Buzz(){
        //Arrage
        MultiplosDeCinco numero = new MultiplosDeCinco();
        //Act
        String result = numero.siEsMultiplo(45);
        //Assert
        Assert.assertEquals("Buzz", result);

    }

 

}
