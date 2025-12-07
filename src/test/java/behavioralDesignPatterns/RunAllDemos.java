package behavioralDesignPatterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import behavioralDesignPatterns.chainOfResponsibility.ChainDemo;
import behavioralDesignPatterns.command.CommandDemo;
import behavioralDesignPatterns.interpreter.InterpreterDemo;
import behavioralDesignPatterns.iterator.IteratorDemo;
import behavioralDesignPatterns.mediator.MediatorDemo;
import behavioralDesignPatterns.memento.MementoDemo;
import behavioralDesignPatterns.observer.ObserverDemo;
import behavioralDesignPatterns.state.StateDemo;
import behavioralDesignPatterns.strategy.StrategyDemo;
import behavioralDesignPatterns.templateMethod.TemplateMethodDemo;
import behavioralDesignPatterns.visitor.VisitorDemo;

public class RunAllDemos {
    @Test
    @DisplayName("CHAIN OF RESPONSIBILITY")
    void demoChainOfResponsibility() {
        ChainDemo.main(new String[]{});
    }

    @Test
    @DisplayName("COMMAND")
    void demoCommand() {
        CommandDemo.main(new String[]{});
    }

    @Test
    @DisplayName("INTERPRETER")
    void demoInterpreter() {
        InterpreterDemo.main(new String[]{});
    }

    @Test
    @DisplayName("ITERATOR")
    void demoIterator() {
        IteratorDemo.main(new String[]{});
    }

    @Test
    @DisplayName("MEDIATOR")
    void demoMediator() {
        MediatorDemo.main(new String[]{});
    }

    @Test
    @DisplayName("MEMENTO")
    void demoMemento() {
        MementoDemo.main(new String[]{});
    }

    @Test
    @DisplayName("OBSERVER")
    void demoObserver() {
        ObserverDemo.main(new String[]{});
    }

    @Test
    @DisplayName("STATE")
    void demoState() {
        StateDemo.main(new String[]{});
    }

    @Test
    @DisplayName("STRATEGY")
    void demoStrategy() {
        StrategyDemo.main(new String[]{});
    }

    @Test
    @DisplayName("TEMPLATE")
    void demoTemplate() {
        TemplateMethodDemo.main(new String[]{});
    }

    @Test
    @DisplayName("VISITOR")
    void demoVisitor() {
        VisitorDemo.main(new String[]{});
    }

}
