--insert into Movies(title, director, release_date, genre, rating, description)
--values ('검은 수녀들', '권혁재', '2025-01-24', '미스터리,드라마', 9.0, '금지된 곳으로 갈 준비가 되었습니다.');
insert into Movies(title, director, release_date, genre, rating, description, created_at, updated_at) values ('검은 수녀들', '권혁재', '2025-01-24', '미스터리,드라마', 9.0, '금지된 곳으로 갈 준비가 되었습니다.', '2025-01-24 12:34:56', '2025-01-24 12:34:56');

insert into Movies(title, director, release_date, genre, rating, description, created_at, updated_at) values ('하얼빈', '우민호', '2024-12-24', '드라마,액션,스릴러,느와르,첩보,시대극', 9.3, '안중근 의사 하얼빈 의거를 다룬 우민호 감독의 여섯 번째 장편 영화. 제49회 토론토 국제 영화제 갈라 프레젠테이션 부문 공식 초청작이다.', '2025-01-24 12:34:56', '2025-01-24 12:34:56');

--insert into MoviePosters(movie_id, poster_url, created_at) values (1, 'https://img.cgv.co.kr/Movie/Thumbnail/Poster/000089/89398/89398_320.jpg', '2025-01-24 12:34:56');
--insert into MoviePosters(movie_id, poster_url, created_at) values (1, 'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000089/89398/89398233560_727.jpg', '2025-01-24 12:34:56');
--insert into MoviePosters(movie_id, poster_url, created_at) values (2, 'https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88797/88797_320.jpg', '2025-01-24 12:34:56');

insert into movie_posters(movie_id, poster_url) values (1, 'https://img.cgv.co.kr/Movie/Thumbnail/Poster/000089/89398/89398_320.jpg');
insert into movie_posters(movie_id, poster_url) values (1, 'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000089/89398/89398233560_727.jpg');
insert into movie_posters(movie_id, poster_url) values (2, 'https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88797/88797_320.jpg');

--INSERT INTO MoviePosters (movie_id, poster_url)
--VALUES
--(1, 'https://img.cgv.co.kr/Movie/Thumbnail/Poster/000089/89398/89398_320.jpg'),
--(1, 'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000089/89398/89398233560_727.jpg'),
--(2, 'https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88797/88797_320.jpg');
