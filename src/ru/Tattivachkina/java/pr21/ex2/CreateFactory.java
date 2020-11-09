package ru.Tattivachkina.java.pr21.ex2;

public class CreateFactory implements Factory {
    @Override
    public VictorianChair createVictorian() {
        return (new VictorianChair());
    }

    @Override
    public MultiFunctionChair createMulti() {
        return (new MultiFunctionChair());
    }

    @Override
    public MagicChair createMagic() {
        return (new MagicChair());
    }
}
