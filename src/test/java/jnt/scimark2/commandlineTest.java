package jnt.scimark2;

import org.junit.jupiter.api.Test;

class commandlineTest {

    @Test
    void testMain() {
        String[] args = {};
        commandline.main(args);
    }

    @Test
    void testMainLarge() {
        String[] args = { "-large" };
        commandline.main(args);
    }
}
