package estructural.proxy;

import java.util.Optional;

public interface BankLegalAudit {

 	Optional<Float> totalMoneyInBank(String bankAccount);
}
