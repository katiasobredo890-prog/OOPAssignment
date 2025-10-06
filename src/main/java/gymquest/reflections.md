Reflektioner, OOP final assignment.
Katja Sobredo Litvinova.

Jag har valt att göra ett spel som heter ”GymQuest”. Spelet går ut på att spelaren (hjälten) tränar på gymmet, möter olika hinder i form av monster och samlar XP för att levla upp till level 10 där man vinner spelet. Monstren representerar typiska gymproblem som Ego Lifting och Overtraining, och målet är att hålla sig vid liv (fokus = HP) och motiverad (XP).

Spelet använder klasser och arv, en tydlig hierarki med en abstrakt superklass Character, som både Hero, Monster och monsters underklasser Egolifting och Boss ärver från.
Både Character och Monster har abstrakta metoder (attack() och randomXP()) som gör att underklasserna måste skapa sina egna versioner.
Alla viktiga variabler (t.ex. HP, damage, XP) är privata, och jag använder getters och setters för att hämta och ändra värdena på ett säkert sätt, detta kallas för inkapsling i OOP.

Jag använder loopar i GameHelper för att hålla spelet igång tills hjälten dör eller når level 10, samt en switch sats för att skriva ut namn vid level up på varje level i Hero klassen.
Med Math.random() skapas slumpmässiga möten och chans till extra XP.
Spelet innehåller även en vapenklass, där hjälten har ett vapen som ger extra damage i strid.
Bossklassen ärver från Monster och har en specialattack med 30 % chans att göra dubbel skada.
I Encounter-klassen bestäms slumpmässigt om man möter ett vanligt monster, en boss eller får en bra dag (safe zone).
Själva striderna sker i GameHelper, där hjälten attackerar först och loopen fortsätter tills någon har 0 HP, när man vinner får man XP och kan levla upp och då ökar max HP och hjälten får nya titlar som Rookie, Gymbro eller Athlete samtidigt som XP återställs till noll igen. 

Förbättringar:
I den initiella idén var mycket större än vad den blev, jag ville göra fler loopar tex en för att skriva ut ”Level 1” osv före varje utskrift och jag ville ha en shop med proteinpulver som skulle öka HP osv, samt snyggare utskrifter men detta gick inte pga tidsbristen även fast jag jobbade med denna uppgift både kvällar och helgdagar.
Trots att jag skulle kunna förbättra hur mycket som helst och tyvärr inte hann med VG delen som jag ville hinna med tycker jag ändå att jag har lärt mig extremt mycket mer av att jobba med denna uppgift än jag har gjort tidigare i kursen och det känns väldigt roligt att förstå mer! 