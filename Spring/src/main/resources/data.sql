INSERT INTO users (first_name, last_name, email, password, role, blocked) VALUES
('Masa', 'Corovic', 'masa432@example.com', '432', 'USER', false),
('Ivana', 'Kovcic', 'ivana123@example.com', '123', 'USER', true);

INSERT INTO category (name, description) VALUES
('Akcija', 'Igre pune adrenalina'),
('Avantura', 'Istraživanje i priče'),
('Pucačine', 'FPS i TPS igre'),
('Puzzle', 'Logičke i mozgalice'),
('Sport', 'Sportske igre'),
('Trke', 'Utrke i brzina'),
('Strategija', 'Planiranje i taktika');



INSERT INTO game (title, description, url, category_id) VALUES
('Super Igra', 'Brza akciona igra sa puno nivoa', 'https://example.com/super-igra', 1),
('Zombie Attack', 'Preživi napad zombija u gradu', 'https://example.com/zombie-attack', 1),
('Island Quest', 'Istraži misteriozno ostrvo', 'https://example.com/island-quest', 2),
('Lost Temple', 'Avantura kroz drevni hram', 'https://example.com/lost-temple', 2),
('Sniper Elite', 'Precizno gađanje ciljeva', 'https://example.com/sniper-elite', 3),
('Battle Zone', 'Intenzivne borbe u areni', 'https://example.com/battle-zone', 3),
('Brain Teaser', 'Zagonetke koje testiraju logiku', 'https://example.com/brain-teaser', 4),
('Math Puzzle', 'Matematičke mozgalice', 'https://example.com/math-puzzle', 4),
('Football Stars', 'Fudbalska simulacija', 'https://example.com/football-stars', 5),
('Basket Pro', 'Košarkaška igra turnira', 'https://example.com/basket-pro', 5),
('Speed Racer', 'Trke na visokim brzinama', 'https://example.com/speed-racer', 6),
('Drift King', 'Umetnost driftovanja', 'https://example.com/drift-king', 6),
('Empire Builder', 'Izgradi svoje carstvo', 'https://example.com/empire-builder', 7),
('War Strategy', 'Planiraj i osvoji teritorije', 'https://example.com/war-strategy', 7);

INSERT INTO achievement (user_id, game_id, title, description) VALUES
(1, 1, 'First Win', 'Prva pobeda u igri'),
(1, 2, 'Zombie Killer', 'Pobedio 10 zombija'),
(1, 3, 'Explorer', 'Otkrio sve lokacije');