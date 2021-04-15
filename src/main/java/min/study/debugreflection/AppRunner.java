package min.study.debugreflection;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        var objectMapper = new ObjectMapper();

        String message = "{\"name\":\"gom\",\"age\":\"20\",\"company\":\"seoul\"}";
        var human = objectMapper.readValue(message, Human.class);
        System.out.println("human:" + human);
    }
}