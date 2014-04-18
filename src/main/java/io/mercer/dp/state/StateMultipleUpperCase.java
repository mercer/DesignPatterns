package io.mercer.dp.state;

public class StateMultipleUpperCase implements StateLike {
    private int count = 0;
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        /* Change state after StateMultipleUpperCase's writeName() gets invoked twice */
        if(++count > 1) {
            context.setState(new StateLowerCase());
        }
    }
}
