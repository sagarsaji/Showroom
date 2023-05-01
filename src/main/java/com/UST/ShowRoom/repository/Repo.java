package com.UST.ShowRoom.repository;


import com.UST.ShowRoom.entity.Showroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Showroom,Integer> {
}
