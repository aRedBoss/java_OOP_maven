### Tehtävä (W): Singleton-luokan rajoitus new-operaatiolla

Singleton-luokka on suunniteltu niin, että sen instanssia ei voi luoda suoraan `new`-operaatiolla. Tämä johtuu siitä, että Singleton-luokan ainoa sallittu instanssi luodaan luokan sisällä, ja se säilyy koko ohjelman ajan.

Tämä toteutetaan seuraavilla tavoilla:

1. **Private konstruktorin käyttö:** Singleton-luokassa on konstruktorin näkyvyys asetettu `private`-tasolle, jolloin luokan ulkopuoliset osat eivät voi luoda uusia instansseja `new`-operaatiolla.

2. **Staattinen metodi:** Luokan ainoa instanssi luodaan staattisen metodin kautta. Tämä metodi tarkistaa, onko instanssia jo luotu. Jos ei, se luo uuden instanssin ja palauttaa sen.

Tämä lähestymistapa varmistaa, että Singleton-luokasta voidaan luoda vain yksi instanssi ohjelman elinkaaren aikana.
