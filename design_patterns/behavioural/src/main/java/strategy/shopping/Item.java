package strategy.shopping;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    private final String name;
    private final double price;
}
