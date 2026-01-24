package com.softserve.edu.teachua.wraps.search;

//
// Factory Method Pattern
//

interface Strategy {
    Search getStrategy();
}

class ImplicitStrategy implements Strategy {
    public Search getStrategy() {
        return new SearchImplicit();
    }
}

class ExplicitStrategyPresent implements Strategy {
    public Search getStrategy() {
        return new SearchExplicitPresent();
    }
}

class ExplicitStrategyVisible implements Strategy {
    public Search getStrategy() {
        return new SearchExplicitVisible();
    }
}
class ExplicitStrategyFirstText implements Strategy{
    public Search getStrategy(){
        return new SearchExplicitPresentFirstText();
    }
}
class ExplicitStrategyTextCss implements Strategy{
    public Search getStrategy(){
        return new SearchExplicitTextCss();
    }
}
class ExplicitStrategyInvisibleElement implements Strategy{
    public Search getStrategy(){
        return new SearchExplicitInvisible();
    }
}



public enum Strategies {
    DEFAULT_STRATEGY(new ImplicitStrategy()),
    IMPLICIT_STRATEGY(new ImplicitStrategy()),
    EXPLICIT_PRESENT_STRATEGY(new ExplicitStrategyPresent()),
    EXPLICIT_VISIBLE_STRATEGY(new ExplicitStrategyVisible()),
    EXPLICIT_FIRST_TEXT_STRATEGY(new ExplicitStrategyFirstText()),
    EXPLICIT_TEXT_STRATEGY(new ExplicitStrategyTextCss()),
    EXPLICIT_INVISIBLE_STRATEGY(new ExplicitStrategyInvisibleElement());





    private Strategy strategy;

    private Strategies(Strategy strategy) {
        this.strategy = strategy;
    }

    public Search getStrategy() {
        return strategy.getStrategy();
    }

    @Override
    public String toString() {
        return name();
    }
}
