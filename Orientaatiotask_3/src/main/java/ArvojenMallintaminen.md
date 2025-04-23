### Tehtävä (W): Arvojen määrittely ja mallintaminen ohjelmassa

Kun ohjelmassa halutaan simuloida tiettyä arvoa (esimerkiksi jäätelön hinta, asiakkaan palveluaika), voidaan se toteuttaa seuraavasti:

1. **Valitse arvon tyyppi ja jakautuminen.**
    - Esim. palveluaika voi noudattaa normaalijakaumaa, kun taas hinta voi olla satunnaisesti valittu väliltä 2–4 euroa.

2. **Käytä satunnaislukugeneraattoria arvon tuottamiseen.**
    - Esimerkiksi `Math.random()` tai vastaava Java-metodi.

3. **Jos jakauma ei ole tasainen**, muunna satunnaisluku halutun jakauman mukaan.
    - Esim. eksponentiaalinen arvo: `-log(1 - r) * lambda`, missä `r` on satunnaisluku väliltä (0,1).

4. **Mallinna tulos ja tarkastele sen realistisuutta.**
    - Tee testi: toimiiko ohjelma halutulla tavalla?

Tällaiset arvonmäärittelyt ovat keskeisiä simulaation onnistumisessa, koska ne vaikuttavat siihen, kuinka luonnollisesti ohjelma käyttäytyy.
