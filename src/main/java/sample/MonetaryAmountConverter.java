package sample;

import java.math.BigDecimal;

import javax.money.MonetaryAmount;

import org.springdoc.core.SpringDocUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
@Schema
public class MonetaryAmountConverter {
	@JsonProperty("amount")
	@Schema(example = "99.96")
	private BigDecimal amount;

	@JsonProperty("currency")
	@Schema(example = "USD")
	private String currency;
	
	static void  configure()
	{
		SpringDocUtils.getConfig().replaceWithClass(MonetaryAmount.class, MonetaryAmountConverter.class);
	}
}
