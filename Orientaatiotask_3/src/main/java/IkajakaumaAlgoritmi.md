### Tehtävä (W): Ikäjakauman simuloiminen

Kun halutaan simuloida opiskelijaryhmän ikäjakaumaa, tulee luoda **1000 ikäarvoa**, jotka jakautuvat samalla tavalla kuin ryhmän todellinen jakauma. Tähän tarvitaan seuraavat vaiheet:

1. **Määrittele ikäryhmät ja niiden suhteelliset osuudet**
    - 18–20 vuotta: 40 %
    - 21–23 vuotta: 35 %
    - 24–26 vuotta: 15 %
    - 27–30 vuotta: 10 %

2. **Luo kertymätaulukko**, joka perustuu todennäköisyyksiin:
    - 0.0 – 0.4 → 18–20 vuotta
    - 0.4 – 0.75 → 21–23 vuotta
    - 0.75 – 0.9 → 24–26 vuotta
    - 0.9 – 1.0 → 27–30 vuotta

3. **Arvo satunnaisluku väliltä [0, 1)** 1000 kertaa.

4. **Määrittele satunnaisluvun avulla, mihin ikäryhmään se kuuluu**, ja arvo tarkka ikä kyseisestä ryhmästä:
    - Esimerkki: jos satunnaisluku on `0.35`, se osuu välille `0.0–0.4` → valitaan ikä **18–20** väliltä.

5. **Tallenna tulokset taulukkoon** ja tarkastele jakauman onnistumista.

Tämä lähestymistapa on helposti ohjelmoitavissa, koska se hyödyntää **satunnaislukuja ja ehtolauseita** jakaumien simulointiin.
