
**a) Miksi saapumis- tapahtuman täytyy luoda uusi saapumistapahtuma?**

- **Vastaus:** Saapumistapahtuma luo uuden saapumistapahtuman simuloidakseen jatkuvaa asiakkaiden saapumista. Kun asiakas saapuu ja käsitellään, järjestelmä voi aikatauluttaa seuraavan asiakkaan saapumisen tulevaisuudessa, jolloin saadaan aikaiseksi jatkuva simulaatiokierre.

---

**b) Mikä tapahtuma täytyy luoda palvelun alkaessa (yksittäisen palvelupisteen osalta)?**

- **Vastaus:** Palvelun alkaessa asiakkaalle täytyy luoda **uloskäyntitapahtuma**. Tämä tapahtuma tapahtuu, kun palvelu asiakkaille on suoritettu, ja asiakas poistuu järjestelmästä.
