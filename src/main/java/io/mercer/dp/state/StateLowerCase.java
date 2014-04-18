package io.mercer.dp.state;

public class StateLowerCase implements StateLike {
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateMultipleUpperCase());
    }
}
