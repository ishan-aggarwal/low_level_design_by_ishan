package chain_of_responsibility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Request {
    private final String name;
    private final RequestType type;
}
