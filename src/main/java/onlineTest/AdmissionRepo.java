package onlineTest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AdmissionRepo implements CrudRepository<Admission, Long> {
    @Override
    public <S extends Admission> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Admission> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Admission> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Admission> findAll() {
        return null;
    }

    @Override
    public Iterable<Admission> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Admission entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Admission> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
