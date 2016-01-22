package org.alexia.poc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HookTest {
    @Test
    public void should_add() throws Exception {
        Hook hook = new Hook(2);
        int result = hook.addOne();
        assertThat(result).isEqualTo(2);
    }
}