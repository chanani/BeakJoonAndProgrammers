SELECT
    animal_id,
    name,
    IF(sex_upon_intake REGEXP '^neutered|^spayed', 'O', 'X') '중성화'
FROM
    animal_ins;