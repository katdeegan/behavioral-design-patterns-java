package patternComparison;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import patternComparison.chainOfResponsibilityVsMediator.ChainOfResponsibilityVsMediator;
import patternComparison.observerVsCommand.ObserverVsCommand;
import patternComparison.strategyVsStateVsTemplate.StrategyVsStateVsTemplate;

public class PatternComparisonTest {
    @Test
    @DisplayName("Run Observer vs Command demonstration")
    void testObserverVsCommand() {
        ObserverVsCommand.main(new String[]{});
    }

    @Test
    @DisplayName("Run Strategy vs State vs Template demonstration")
    void testStrategyVsState() {
        StrategyVsStateVsTemplate.main(new String[]{});
    }

    @Test
    @DisplayName("Run Chain vs Mediator demonstration")
    void testTemplateMethodComparison() {
        ChainOfResponsibilityVsMediator.main(new String[]{});
    }
}
