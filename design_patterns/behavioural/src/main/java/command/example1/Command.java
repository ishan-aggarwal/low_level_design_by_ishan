package command.example1;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Command {
    private CommandType name;
    private List<String> param;

    public CommandType getName() {
        return name;
    }

    public List<String> getParam() {
        return param;
    }
}