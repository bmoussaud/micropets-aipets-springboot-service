package org.moussaud.micropets.pets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.bindings.Binding;
import org.springframework.cloud.bindings.Bindings;
import org.springframework.cloud.bindings.boot.BindingsPropertiesProcessor;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Map;

public final class OpenAIBindingsPropertiesProcessor implements BindingsPropertiesProcessor {

    public static final String TYPE = "openai";

    static Logger logger = LoggerFactory.getLogger(AIPetsGenerator.class);

    @Override
    public void process(Environment environment, Bindings bindings, Map<String, Object> properties) {
        logger.debug("process openai bindings");
        List<Binding> myBindings = bindings.filterBindings(TYPE);
        if (myBindings.size() == 0) {
            return;
        }
        properties.put("k8s.bindings.openai.apikey", myBindings.get(0).getSecret().get("apikey"));
        properties.put("openai.enabled", true);
    }

}
