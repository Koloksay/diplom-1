import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType ingredientType;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING}
        });
    }

    public IngredientTypeTest(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    @Test
    public void testIngredientType() {
        assertEquals(ingredientType.name(), ingredientType.toString());
    }
    @Test
    public void testValueIngredientType() {
        assertEquals(ingredientType.ordinal(), Arrays.asList(IngredientType.values()).indexOf(ingredientType));
    }
}