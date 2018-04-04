package co.edu.uniandes.Workshop7.Library;

import uk.co.jemos.podam.common.AttributeStrategy;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TypeBookStratergy implements AttributeStrategy<String> {

    private static final List<String> TYPES  =  Arrays.asList("Biographies", "Scientists", "Science fiction");

    @Override
    public String getValue(Class<?> aClass, List<Annotation> list) {
        Random r = new Random();

        int pos =r.nextInt(100000) % 3;
        return TYPES.get(pos);
    }
}
