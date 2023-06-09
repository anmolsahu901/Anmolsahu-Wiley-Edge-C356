package com.example.Practice2springbootJPA.Repository;

import com.example.Practice2springbootJPA.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

//    introducer-critia
    public List<User> findByName(String name);

    public List<User> findByCity(String name);

    public User findByNameAndCity(String name,String city);

    public List<User> findByNamestartingWith(String prefix);

    public List<User> findByNameEndingWith(String suffix);

    public List<User> findByNameContaining(String words);

    public List<User> findByNameLike(String likePattern);

//    public List<User> findByAgeLessThan(int age);
//
//    public List<User> findByAgeGreaterThanEqual(int age);
//
//    public List<User> findByAgeIn(Collection<Integer> ages);







}
