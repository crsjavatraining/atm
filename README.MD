ATM
---

Írjon egy Bankautomata nevű osztályt az alábbi két konstruktorral: 
- Public Bankautomata() Public Bankautomata(int kezdoosszeg) 

Ezáltal a Bankautomata() egy üres automatát hoz létre és Bankautomata(osszeg) egy automatát  aminek az ”osszeg”-e elérhető számunkra.   

- A „Public void feltoltes (int osszeg)„
       
 nevű metódussal meg tudjuk tolteni az automatát azáltal hogy  az automatában elérhető „osszeg”-et növeljük.   A
- „Public int osszegmutatas()” 
        
metódussal le tudjuk kérni mennyi pénzünk van a bankban és a „Public int felvetel(int osszeg)” metódussal pénzt tudunk felvenni azaz csökken a az elérhető „osszeg” de csak akkor ha az elérhető összegnél kevesebbet vagy egyenlő mennyiséget veszünk fel.