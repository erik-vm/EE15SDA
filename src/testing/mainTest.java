package testing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class mainTest {

    @Test
    void test(){
        assertThat("\t".length()>0).isTrue();
    }

}