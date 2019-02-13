package be.riots.botclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Log {
    LogType typeOfLog;
    GpsSensor gpsSensor;
    DepthSensor depthSensor;
    MotionSensor motionSensor;
    String comment;


}
