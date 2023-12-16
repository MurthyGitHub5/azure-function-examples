package org.example.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;

import java.time.LocalDateTime;

/**
 * Azure Functions with Timer trigger.
 */
public class TimerTriggerJava {
    /**
     * This function will be invoked periodically according to the specified schedule.
     */
    @FunctionName("TimerTriggerJava")
    public void run(
        @TimerTrigger(name = "timerInfo", schedule = "0 * * * * *") String timerInfo,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
    }
}
