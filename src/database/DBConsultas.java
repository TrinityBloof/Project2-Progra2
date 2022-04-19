/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import GUI.pnlQR;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import objetos.*;

/**
 *
 * @author gara8
 */
public class DBConsultas {

    private ResultSet rs = null, rs2 = null;
    private Statement s = null;
    DBConexion conexion = new DBConexion();
    private Connection connection = null;
    Boolean boleano = false;
    String cadena = "";

    public boolean login(String user, String pass) {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT id FROM usuarios WHERE pass = crypt('" + pass + "', pass) AND name = '" + user + "'");
            while (rs.next()) {
                if (rs.getInt("id") >= 0) {
                    boleano = true;
                } else {
                    boleano = false;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return boleano;

    }

    public ArrayList<String> cargarNombresCasasPublicacion() {
        ArrayList<String> casas = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT publisher FROM super_heroes WHERE publisher IS NOT NULL GROUP BY publisher");
            while (rs.next()) {
                casas.add(rs.getString("publisher"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return casas;
    }

    public ArrayList<GraficaPastel> cargarGrafico(String casa) {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name, SUM(omniscient::int + omnipresent::int + vision_cryo::int + molecular_dissipation::int + phoenix_force::int + speed_force::int + symbiote_costume::int + odin_force::int + reality_warping::int + web_creation::int + vision_thermal::int + vision_x_ray::int + weather_control::int + qwardian_power_ring::int + radar_sense::int + vitakinesis::int + vision_heat::int + terrakinesis::int + resurrection::int + the_force::int + matter_absorption::int + grim_reaping::int + vision_infrared::int + vision_night::int + wallcrawling::int + super_breath::int + wind_control::int + melting::int + vision_microscopic::int + intuitive_aptitude::int + radiation_absorption::int + sub_mariner::int + invisibility::int + magic_resistance::int + enhanced_touch::int + time_manipulation::int + sonic_scream::int + sonar::int + plant_control::int + mind_control_resistance::int + magnetism::int + portal_creation::int + omnilingualism::int + molecular_combustion::int + telepathy_resistance::int + energy_resistance::int + spatial_awareness::int + toxin_and_disease_resistance::int + vision_telescopic::int + radiation_immunity::int + water_control::int + biokinesis::int + power_cosmic::int + changing_armor::int + cloaking::int + omnipotent::int + illumination::int + hair_manipulation::int + thirstokinesis::int + illusions::int + enhanced_smell::int + time_travel::int + natural_weapons::int + heat_resistance::int + energy_manipulation::int + banish::int + toxin_and_disease_control::int + levitation::int + echolocation::int + light_control::int + regeneration::int + gravity_control::int + probability_manipulation::int + mind_blast::int + power_suit::int + gliding::int + adaptation::int + heat_generation::int + molecular_manipulation::int + enhanced_sight::int + intangibility::int + natural_armor::int + animal_control::int + hypnokinesis::int + insanity::int + nova_force::int + enhanced_hearing::int + power_absorption::int + fire_resistance::int + mind_control::int + precognition::int + animation::int + seismic_power::int + photographic_reflexes::int + technopath_cyberpath::int + elemental_transmogrification::int + substance_secretion::int + elasticity::int + psionic_powers::int + radiation_control::int + power_nullifier::int + empathy::int + anti_gravity::int + self_sustenance::int + force_fields::int + energy_constructs::int + invulnerability::int + reflexes::int + enhanced_memory::int + summoning::int + projection::int + fire_control::int + electrical_transport::int + astral_projection::int + phasing::int + element_control::int + camouflage::int + immortality::int + peak_human_condition::int + shapeshifting::int + power_sense::int + dimensional_travel::int + clairvoyance::int + jump::int + hyperkinesis::int + magic::int + energy_beams::int + telekinesis::int + enhanced_senses::int + teleportation::int + death_touch::int + darkforce_manipulation::int + electrokinesis::int + weapon_based_powers::int + animal_oriented_powers::int + possession::int + super_speed::int + omnitrix::int + dexterity::int + audio_control::int + astral_travel::int + stamina::int + density_control::int + size_changing::int + duplication::int + energy_blasts::int + energy_armor::int + telepathy::int + cryokinesis::int + super_strength::int + intelligence::int + longevity::int + animal_attributes::int + power_augmentation::int + weapons_master::int + marksmanship::int + underwater_breathing::int + danger_sense::int + flight::int + energy_absorption::int + stealth::int + durability::int + cold_resistance::int + dimensional_awareness::int + lantern_power_ring::int + accelerated_healing::int + agility::int) FROM super_heroes, poderes p WHERE publisher = '" + casa + "' AND hero_names = name GROUP BY name order by SUM desc limit 10");
            while (rs.next()) {
                GraficaPastel.listaDatos.add(new GraficaPastel(rs.getString("name"), rs.getInt("SUM")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return GraficaPastel.listaDatos;
    }

    public ArrayList<Graficos> cargarGraficoPorcentajexCasa() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT publisher, Count(publisher) FROM super_heroes WHERE publisher IS NOT null GROUP BY publisher HAVING COUNT(*)>0");
            while (rs.next()) {
                Graficos.listaDatos.add(new Graficos(rs.getString("publisher"), rs.getInt("Count")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Graficos.listaDatos;
    }

    public ArrayList<Graficos> cargarGraficoPorGenero() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT gender, Count(gender) FROM super_heroes GROUP BY gender HAVING COUNT(*)>0");
            while (rs.next()) {
                Graficos.listaDatos.add(new Graficos(rs.getString("gender"), rs.getInt("Count")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Graficos.listaDatos;
    }

    public ArrayList<Graficos> cargarGraficoAlturaGenero() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT height, gender, Count(height) FROM super_heroes GROUP BY height, gender HAVING COUNT(*)>0");
            while (rs.next()) {
                cadena = rs.getString("gender") + " " + String.valueOf(rs.getDouble("height"));
                Graficos.listaDatos.add(new Graficos(cadena, rs.getInt("Count")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Graficos.listaDatos;
    }

    public ArrayList<Graficos> cargarGraficoAlineacionF() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT alignment, Count(alignment) FROM super_heroes WHERE gender = 'Female' GROUP BY alignment HAVING COUNT(*)>0");
            while (rs.next()) {
                Graficos.listaDatos.add(new Graficos(rs.getString("alignment"), rs.getInt("Count")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Graficos.listaDatos;
    }

    public ArrayList<Graficos> cargarGraficoColorPiel() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT skincolor, Count(skincolor) FROM super_heroes GROUP BY skincolor HAVING COUNT(*)>0");
            while (rs.next()) {
                Graficos.listaDatos.add(new Graficos(rs.getString("skincolor"), rs.getInt("Count")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Graficos.listaDatos;
    }

    public ArrayList<Graficos> cargarGraficoCalvos() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT Count(haircolor) FROM super_heroes WHERE haircolor <> '-' OR haircolor <> 'No Hair'");
            while (rs.next()) {
                rs2 = s.executeQuery("SELECT Count(haircolor) FROM super_heroes WHERE haircolor = 'No Hair'");
                Graficos.listaDatos.add(new Graficos("Con cabello", rs.getInt("Count")));
                while (rs2.next()) {
                    Graficos.listaDatos.add(new Graficos("Calvo", rs2.getInt("Count")));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return Graficos.listaDatos;
    }

    public ArrayList<Top10xAltura> cargarTop10xAltura() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name, gender, eyecolor, race, haircolor, height, publisher FROM super_heroes WHERE haircolor<>'No Hair' AND haircolor<>'-' AND race<>'-' order by height desc limit 10");
            while (rs.next()) {
                Top10xAltura.listaDatos.add(new Top10xAltura(rs.getString("name"), rs.getString("gender"), rs.getString("eyecolor"), rs.getString("race"), rs.getString("haircolor"), rs.getDouble("height"), rs.getString("publisher")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return Top10xAltura.listaDatos;
    }

    public ArrayList<Calvos> cargarCalvos() {
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name, haircolor FROM super_heroes WHERE haircolor = 'No Hair' ORDER BY name asc");
            while (rs.next()) {
                Calvos.listaDatos.add(new Calvos(rs.getString("name"), rs.getString("haircolor")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return Calvos.listaDatos;
    }

    public ArrayList<String> cargarNombresHeroes() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name FROM super_heroes ORDER BY name ASC");
            while (rs.next()) {
                nombres.add(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public ArrayList<String> cargarNombresHeroes1() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name FROM super_heroes WHERE name LIKE 'A%' OR name LIKE 'B%' OR name LIKE 'C%' OR name LIKE 'D%' OR name LIKE 'E%' ORDER BY name ASC;");
            while (rs.next()) {
                nombres.add(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public ArrayList<String> cargarNombresHeroes2() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name FROM super_heroes WHERE name LIKE 'F%' OR name LIKE 'G%' OR name LIKE 'H%' OR name LIKE 'I%' OR name LIKE 'J%' OR name LIKE 'K%' ORDER BY name ASC;");
            while (rs.next()) {
                nombres.add(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public ArrayList<String> cargarNombresHeroes3() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name FROM super_heroes WHERE name LIKE 'L%' OR name LIKE 'M%' OR name LIKE 'N%' OR name LIKE 'O%' OR name LIKE 'P%' ORDER BY name ASC;");
            while (rs.next()) {
                nombres.add(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public ArrayList<String> cargarNombresHeroes4() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name FROM super_heroes WHERE name LIKE 'Q%' OR name LIKE 'R%' OR name LIKE 'S%' OR name LIKE 'T%' OR name LIKE 'U%' OR name LIKE 'V%' ORDER BY name ASC;");
            while (rs.next()) {
                nombres.add(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public ArrayList<String> cargarNombresHeroes5() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name FROM super_heroes WHERE name LIKE 'W%' OR name LIKE 'X%' OR name LIKE 'Y%' OR name LIKE 'Z%' ORDER BY name ASC;");
            while (rs.next()) {
                nombres.add(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public SuperHeroes cargarUnSuperHeroe(String nombre) {
        SuperHeroes datos = new SuperHeroes();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT name, gender, eyecolor, race, haircolor, height, publisher, skincolor, alignment, weight, pic FROM super_heroes WHERE name = '" + nombre + "'");
            while (rs.next()) {
                datos.setNombre(rs.getString("name"));
                datos.setGenero(rs.getString("gender"));
                datos.setColorOjos(rs.getString("eyecolor"));
                datos.setRaza(rs.getString("race"));
                datos.setColorPelo(rs.getString("haircolor"));
                datos.setAltura(rs.getDouble("height"));
                datos.setCasa(rs.getString("publisher"));
                datos.setColorPiel(rs.getString("skincolor"));
                datos.setAlineacion(rs.getString("alignment"));
                datos.setPeso(rs.getDouble("weight"));

                if (rs.getBinaryStream("pic") == null) {
                    datos.setFoto(null);
                } else {
                    ImageIcon foto;
                    InputStream is;
                    is = rs.getBinaryStream("pic");
                    BufferedImage bi = ImageIO.read(is);
                    foto = new ImageIcon(bi);
                    Image img = foto.getImage();
                    Image newimg = img.getScaledInstance(225, 213, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newicon = new ImageIcon(newimg);
                    datos.setFoto(newicon);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public ArrayList<String> cargarNombresHeroesPoderes() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT hero_names FROM poderes ORDER BY hero_names ASC");
            while (rs.next()) {
                nombres.add(rs.getString("hero_names"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return nombres;
    }

    public Poderes cargarUnSuperHeroePoder(String nombre) {
        Poderes datos = new Poderes();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT agility,accelerated_healing,lantern_power_ring,dimensional_awareness,cold_resistance,durability,stealth,energy_absorption,flight,danger_sense,underwater_breathing,marksmanship,weapons_master,power_augmentation,animal_attributes,longevity,intelligence,super_strength,cryokinesis,telepathy,energy_armor,energy_blasts,duplication,size_changing,density_control,stamina,astral_travel,audio_control,dexterity,omnitrix,super_speed,possession,animal_oriented_powers,weapon_based_powers,electrokinesis,darkforce_manipulation,death_touch,teleportation,enhanced_senses,telekinesis,energy_beams,magic,hyperkinesis,jump,clairvoyance,dimensional_travel,power_sense,shapeshifting,peak_human_condition,immortality,camouflage,element_control,phasing,astral_projection,electrical_transport,fire_control,projection,summoning,enhanced_memory,reflexes,invulnerability,energy_constructs,force_fields,self_sustenance,anti_gravity,empathy,power_nullifier,radiation_control,psionic_powers,elasticity,substance_secretion,elemental_transmogrification,technopath_cyberpath,photographic_reflexes,seismic_power,animation,precognition,mind_control,fire_resistance,power_absorption,enhanced_hearing,nova_force,insanity,hypnokinesis,animal_control,natural_armor,intangibility,enhanced_sight,molecular_manipulation,heat_generation,adaptation,gliding,power_suit,mind_blast,probability_manipulation,gravity_control,regeneration,light_control,echolocation,levitation,toxin_and_disease_control,banish,energy_manipulation,heat_resistance,natural_weapons,time_travel,enhanced_smell,illusions,thirstokinesis,hair_manipulation,illumination,omnipotent,cloaking,changing_armor,power_cosmic,biokinesis,water_control,radiation_immunity,vision_telescopic,toxin_and_disease_resistance,spatial_awareness,energy_resistance,telepathy_resistance,molecular_combustion,omnilingualism,portal_creation,magnetism,mind_control_resistance,plant_control,sonar,sonic_scream,time_manipulation,enhanced_touch,magic_resistance,invisibility,sub_mariner,radiation_absorption,intuitive_aptitude,vision_microscopic,melting,wind_control,super_breath,wallcrawling,vision_night,vision_infrared,grim_reaping,matter_absorption,the_force,resurrection,terrakinesis,vision_heat,vitakinesis,radar_sense,qwardian_power_ring,weather_control,vision_x_ray,vision_thermal,web_creation,reality_warping,odin_force,symbiote_costume,speed_force,phoenix_force,molecular_dissipation,vision_cryo,omnipresent,omniscient FROM poderes WHERE hero_names = '" + nombre + "'");
            while (rs.next()) {
                datos.setOmniscient(rs.getBoolean("omniscient"));
                datos.setOmnipresent(rs.getBoolean("omnipresent"));
                datos.setVision_cryo(rs.getBoolean("vision_cryo"));
                datos.setMolecular_dissipation(rs.getBoolean("molecular_dissipation"));
                datos.setPhoenix_force(rs.getBoolean("phoenix_force"));
                datos.setSpeed_force(rs.getBoolean("speed_force"));
                datos.setReality_warping(rs.getBoolean("reality_warping"));
                datos.setOdin_force(rs.getBoolean("odin_force"));
                datos.setSymbiote_costume(rs.getBoolean("symbiote_costume"));
                datos.setWeb_creation(rs.getBoolean("symbiote_costume"));
                datos.setVision_thermal(rs.getBoolean("vision_thermal"));
                datos.setVision_x_ray(rs.getBoolean("vision_x_ray"));
                datos.setWeather_control(rs.getBoolean("weather_control"));
                datos.setQwardian_power_ring(rs.getBoolean("qwardian_power_ring"));
                datos.setRadar_sense(rs.getBoolean("radar_sense"));
                datos.setVitakinesis(rs.getBoolean("vitakinesis"));
                datos.setVision_heat(rs.getBoolean("vision_heat"));
                datos.setTerrakinesis(rs.getBoolean("terrakinesis"));
                datos.setResurrection(rs.getBoolean("resurrection"));
                datos.setThe_force(rs.getBoolean("the_force"));
                datos.setMatter_absorption(rs.getBoolean("matter_absorption"));
                datos.setGrim_reaping(rs.getBoolean("grim_reaping"));
                datos.setVision_infrared(rs.getBoolean("vision_infrared"));
                datos.setVision_night(rs.getBoolean("vision_night"));
                datos.setWallcrawling(rs.getBoolean("wallcrawling"));
                datos.setSuper_breath(rs.getBoolean("super_breath"));
                datos.setWind_control(rs.getBoolean("wind_control"));
                datos.setMelting(rs.getBoolean("melting"));
                datos.setVision_microscopic(rs.getBoolean("vision_microscopic"));
                datos.setIntuitive_aptitude(rs.getBoolean("intuitive_aptitude"));
                datos.setRadiation_absorption(rs.getBoolean("radiation_absorption"));
                datos.setSub_mariner(rs.getBoolean("sub_mariner"));
                datos.setInvisibility(rs.getBoolean("invisibility"));
                datos.setMagic_resistance(rs.getBoolean("magic_resistance"));
                datos.setEnhanced_touch(rs.getBoolean("enhanced_touch"));
                datos.setTime_manipulation(rs.getBoolean("time_manipulation"));
                datos.setSonic_scream(rs.getBoolean("sonic_scream"));
                datos.setSonar(rs.getBoolean("sonar"));
                datos.setPlant_control(rs.getBoolean("plant_control"));
                datos.setMind_control_resistance(rs.getBoolean("mind_control_resistance"));
                datos.setMagnetism(rs.getBoolean("magnetism"));
                datos.setPortal_creation(rs.getBoolean("portal_creation"));
                datos.setOmnilingualism(rs.getBoolean("omnilingualism"));
                datos.setMolecular_combustion(rs.getBoolean("molecular_combustion"));
                datos.setTelepathy_resistance(rs.getBoolean("telepathy_resistance"));
                datos.setEnergy_resistance(rs.getBoolean("energy_resistance"));
                datos.setSpatial_awareness(rs.getBoolean("spatial_awareness"));
                datos.setToxin_and_disease_resistance(rs.getBoolean("toxin_and_disease_resistance"));
                datos.setVision_telescopic(rs.getBoolean("vision_telescopic"));
                datos.setRadiation_immunity(rs.getBoolean("radiation_immunity"));
                datos.setWater_control(rs.getBoolean("water_control"));
                datos.setBiokinesis(rs.getBoolean("biokinesis"));
                datos.setPower_cosmic(rs.getBoolean("power_cosmic"));
                datos.setChanging_armor(rs.getBoolean("changing_armor"));
                datos.setCloaking(rs.getBoolean("cloaking"));
                datos.setOmnipotent(rs.getBoolean("omnipotent"));
                datos.setIllumination(rs.getBoolean("illumination"));
                datos.setHair_manipulation(rs.getBoolean("hair_manipulation"));
                datos.setThirstokinesis(rs.getBoolean("thirstokinesis"));
                datos.setIllusions(rs.getBoolean("illusions"));
                datos.setEnhanced_smell(rs.getBoolean("enhanced_smell"));
                datos.setTime_travel(rs.getBoolean("time_travel"));
                datos.setNatural_weapons(rs.getBoolean("natural_weapons"));
                datos.setHeat_resistance(rs.getBoolean("heat_resistance"));
                datos.setEnergy_manipulation(rs.getBoolean("energy_manipulation"));
                datos.setBanish(rs.getBoolean("banish"));
                datos.setToxin_and_disease_control(rs.getBoolean("toxin_and_disease_control"));
                datos.setLevitation(rs.getBoolean("levitation"));
                datos.setEcholocation(rs.getBoolean("echolocation"));
                datos.setLight_control(rs.getBoolean("light_control"));
                datos.setRegeneration(rs.getBoolean("regeneration"));
                datos.setGravity_control(rs.getBoolean("gravity_control"));
                datos.setProbability_manipulation(rs.getBoolean("probability_manipulation"));
                datos.setMind_blast(rs.getBoolean("mind_blast"));
                datos.setPower_suit(rs.getBoolean("power_suit"));
                datos.setGliding(rs.getBoolean("gliding"));
                datos.setHeat_generation(rs.getBoolean("adaptation"));
                datos.setHeat_generation(rs.getBoolean("heat_generation"));
                datos.setMolecular_manipulation(rs.getBoolean("molecular_manipulation"));
                datos.setEnhanced_sight(rs.getBoolean("enhanced_sight"));
                datos.setIntangibility(rs.getBoolean("intangibility"));
                datos.setNatural_armor(rs.getBoolean("natural_armor"));
                datos.setAnimal_control(rs.getBoolean("animal_control"));
                datos.setHypnokinesis(rs.getBoolean("hypnokinesis"));
                datos.setInsanity(rs.getBoolean("insanity"));
                datos.setNova_force(rs.getBoolean("nova_force"));
                datos.setEnhanced_hearing(rs.getBoolean("enhanced_hearing"));
                datos.setPower_absorption(rs.getBoolean("power_absorption"));
                datos.setFire_resistance(rs.getBoolean("fire_resistance"));
                datos.setMind_control(rs.getBoolean("mind_control"));
                datos.setPrecognition(rs.getBoolean("precognition"));
                datos.setAnimation(rs.getBoolean("animation"));
                datos.setSeismic_power(rs.getBoolean("seismic_power"));
                datos.setPhotographic_reflexes(rs.getBoolean("photographic_reflexes"));
                datos.setTechnopath_cyberpath(rs.getBoolean("technopath_cyberpath"));
                datos.setElemental_transmogrification(rs.getBoolean("elemental_transmogrification"));
                datos.setSubstance_secretion(rs.getBoolean("substance_secretion"));
                datos.setElasticity(rs.getBoolean("elasticity"));
                datos.setPsionic_powers(rs.getBoolean("psionic_powers"));
                datos.setRadiation_control(rs.getBoolean("radiation_control"));
                datos.setPower_nullifier(rs.getBoolean("power_nullifier"));
                datos.setEmpathy(rs.getBoolean("empathy"));
                datos.setAnti_gravity(rs.getBoolean("anti_gravity"));
                datos.setSelf_sustenance(rs.getBoolean("self_sustenance"));
                datos.setForce_fields(rs.getBoolean("force_fields"));
                datos.setEnergy_constructs(rs.getBoolean("energy_constructs"));
                datos.setInvulnerability(rs.getBoolean("invulnerability"));
                datos.setReflexes(rs.getBoolean("reflexes"));
                datos.setEnhanced_memory(rs.getBoolean("enhanced_memory"));
                datos.setSummoning(rs.getBoolean("summoning"));
                datos.setProjection(rs.getBoolean("projection"));
                datos.setFire_control(rs.getBoolean("fire_control"));
                datos.setElectrical_transport(rs.getBoolean("electrical_transport"));
                datos.setAstral_projection(rs.getBoolean("astral_projection"));
                datos.setPhasing(rs.getBoolean("phasing"));
                datos.setElement_control(rs.getBoolean("element_control"));
                datos.setCamouflage(rs.getBoolean("camouflage"));
                datos.setImmortality(rs.getBoolean("immortality"));
                datos.setPeak_human_condition(rs.getBoolean("peak_human_condition"));
                datos.setShapeshifting(rs.getBoolean("shapeshifting"));
                datos.setPower_sense(rs.getBoolean("power_sense"));
                datos.setDimensional_travel(rs.getBoolean("dimensional_travel"));
                datos.setClairvoyance(rs.getBoolean("clairvoyance"));
                datos.setJump(rs.getBoolean("jump"));
                datos.setHyperkinesis(rs.getBoolean("hyperkinesis"));
                datos.setMagic(rs.getBoolean("magic"));
                datos.setEnergy_beams(rs.getBoolean("energy_beams"));
                datos.setTelekinesis(rs.getBoolean("telekinesis"));
                datos.setEnhanced_senses(rs.getBoolean("enhanced_senses"));
                datos.setTeleportation(rs.getBoolean("teleportation"));
                datos.setDeath_touch(rs.getBoolean("death_touch"));
                datos.setDarkforce_manipulation(rs.getBoolean("darkforce_manipulation"));
                datos.setElectrokinesis(rs.getBoolean("electrokinesis"));
                datos.setWeapon_based_powers(rs.getBoolean("weapon_based_powers"));
                datos.setAnimal_oriented_powers(rs.getBoolean("animal_oriented_powers"));
                datos.setPossession(rs.getBoolean("possession"));
                datos.setSuper_speed(rs.getBoolean("super_speed"));
                datos.setOmnitrix(rs.getBoolean("omnitrix"));
                datos.setDexterity(rs.getBoolean("dexterity"));
                datos.setAudio_control(rs.getBoolean("audio_control"));
                datos.setAstral_travel(rs.getBoolean("astral_travel"));
                datos.setStamina(rs.getBoolean("stamina"));
                datos.setDensity_control(rs.getBoolean("density_control"));
                datos.setSize_changing(rs.getBoolean("size_changing"));
                datos.setDuplication(rs.getBoolean("duplication"));
                datos.setEnergy_blasts(rs.getBoolean("energy_blasts"));
                datos.setEnergy_armor(rs.getBoolean("energy_armor"));
                datos.setTelepathy(rs.getBoolean("telepathy"));
                datos.setCryokinesis(rs.getBoolean("cryokinesis"));
                datos.setSuper_strength(rs.getBoolean("super_strength"));
                datos.setIntelligence(rs.getBoolean("intelligence"));
                datos.setLongevity(rs.getBoolean("longevity"));
                datos.setAnimal_attributes(rs.getBoolean("animal_attributes"));
                datos.setPower_augmentation(rs.getBoolean("power_augmentation"));
                datos.setWeapons_master(rs.getBoolean("weapons_master"));
                datos.setMarksmanship(rs.getBoolean("marksmanship"));
                datos.setUnderwater_breathing(rs.getBoolean("underwater_breathing"));
                datos.setDanger_sense(rs.getBoolean("danger_sense"));
                datos.setFlight(rs.getBoolean("flight"));
                datos.setEnergy_absorption(rs.getBoolean("energy_absorption"));
                datos.setStealth(rs.getBoolean("stealth"));
                datos.setDurability(rs.getBoolean("durability"));
                datos.setCold_resistance(rs.getBoolean("cold_resistance"));
                datos.setDimensional_awareness(rs.getBoolean("dimensional_awareness"));
                datos.setLantern_power_ring(rs.getBoolean("lantern_power_ring"));
                datos.setAccelerated_healing(rs.getBoolean("accelerated_healing"));
                datos.setAgility(rs.getBoolean("agility"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }

    public qr cargarUnQr(String nombre) {
        qr datos = new qr();
        try {
            connection = conexion.Conexion();
            s = connection.createStatement();
            rs = s.executeQuery("SELECT sh.name, sh.gender, sh.eyecolor, sh.race, sh.haircolor, sh.height, sh.publisher, sh.skincolor, sh.alignment, sh.weight, sh.pic, agility,accelerated_healing,lantern_power_ring,dimensional_awareness,cold_resistance,durability,stealth,energy_absorption,flight,danger_sense,underwater_breathing,marksmanship,weapons_master,power_augmentation,animal_attributes,longevity,intelligence,super_strength,cryokinesis,telepathy,energy_armor,energy_blasts,duplication,size_changing,density_control,stamina,astral_travel,audio_control,dexterity,omnitrix,super_speed,possession,animal_oriented_powers,weapon_based_powers,electrokinesis,darkforce_manipulation,death_touch,teleportation,enhanced_senses,telekinesis,energy_beams,magic,hyperkinesis,jump,clairvoyance,dimensional_travel,power_sense,shapeshifting,peak_human_condition,immortality,camouflage,element_control,phasing,astral_projection,electrical_transport,fire_control,projection,summoning,enhanced_memory,reflexes,invulnerability,energy_constructs,force_fields,self_sustenance,anti_gravity,empathy,power_nullifier,radiation_control,psionic_powers,elasticity,substance_secretion,elemental_transmogrification,technopath_cyberpath,photographic_reflexes,seismic_power,animation,precognition,mind_control,fire_resistance,power_absorption,enhanced_hearing,nova_force,insanity,hypnokinesis,animal_control,natural_armor,intangibility,enhanced_sight,molecular_manipulation,heat_generation,adaptation,gliding,power_suit,mind_blast,probability_manipulation,gravity_control,regeneration,light_control,echolocation,levitation,toxin_and_disease_control,banish,energy_manipulation,heat_resistance,natural_weapons,time_travel,enhanced_smell,illusions,thirstokinesis,hair_manipulation,illumination,omnipotent,cloaking,changing_armor,power_cosmic,biokinesis,water_control,radiation_immunity,vision_telescopic,toxin_and_disease_resistance,spatial_awareness,energy_resistance,telepathy_resistance,molecular_combustion,omnilingualism,portal_creation,magnetism,mind_control_resistance,plant_control,sonar,sonic_scream,time_manipulation,enhanced_touch,magic_resistance,invisibility,sub_mariner,radiation_absorption,intuitive_aptitude,vision_microscopic,melting,wind_control,super_breath,wallcrawling,vision_night,vision_infrared,grim_reaping,matter_absorption,the_force,resurrection,terrakinesis,vision_heat,vitakinesis,radar_sense,qwardian_power_ring,weather_control,vision_x_ray,vision_thermal,web_creation,reality_warping,odin_force,symbiote_costume,speed_force,phoenix_force,molecular_dissipation,vision_cryo,omnipresent,omniscient FROM poderes, super_heroes sh WHERE hero_names = '" + nombre + "' AND sh.name = '" + nombre + "'");
            while (rs.next()) {
                datos.setNombre(rs.getString("name"));
                datos.setGenero(rs.getString("gender"));
                datos.setColorOjos(rs.getString("eyecolor"));
                datos.setRaza(rs.getString("race"));
                datos.setColorPelo(rs.getString("haircolor"));
                datos.setAltura(rs.getDouble("height"));
                datos.setCasa(rs.getString("publisher"));
                datos.setColorPiel(rs.getString("skincolor"));
                datos.setAlineacion(rs.getString("alignment"));
                datos.setPeso(rs.getDouble("weight"));

                if (rs.getBinaryStream("pic") == null) {
                    datos.setFoto(null);
                } else {
                    ImageIcon foto;
                    InputStream is;
                    is = rs.getBinaryStream("pic");
                    BufferedImage bi = ImageIO.read(is);
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(bi, "png", baos);
                    foto = new ImageIcon(bi);
                    Image img = foto.getImage();
                    Image newimg = img.getScaledInstance(225, 213, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newicon = new ImageIcon(newimg);
                    datos.setFoto(newicon);

                    File f = new File("heroe.png");
                    FileOutputStream fos;
                    try {
                        fos = new FileOutputStream(f);
                        fos.write(baos.toByteArray());
                        fos.flush();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(pnlQR.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(pnlQR.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                datos.setOmniscient(rs.getBoolean("omniscient"));
                datos.setOmnipresent(rs.getBoolean("omnipresent"));
                datos.setVision_cryo(rs.getBoolean("vision_cryo"));
                datos.setMolecular_dissipation(rs.getBoolean("molecular_dissipation"));
                datos.setPhoenix_force(rs.getBoolean("phoenix_force"));
                datos.setSpeed_force(rs.getBoolean("speed_force"));
                datos.setReality_warping(rs.getBoolean("reality_warping"));
                datos.setOdin_force(rs.getBoolean("odin_force"));
                datos.setSymbiote_costume(rs.getBoolean("symbiote_costume"));
                datos.setWeb_creation(rs.getBoolean("symbiote_costume"));
                datos.setVision_thermal(rs.getBoolean("vision_thermal"));
                datos.setVision_x_ray(rs.getBoolean("vision_x_ray"));
                datos.setWeather_control(rs.getBoolean("weather_control"));
                datos.setQwardian_power_ring(rs.getBoolean("qwardian_power_ring"));
                datos.setRadar_sense(rs.getBoolean("radar_sense"));
                datos.setVitakinesis(rs.getBoolean("vitakinesis"));
                datos.setVision_heat(rs.getBoolean("vision_heat"));
                datos.setTerrakinesis(rs.getBoolean("terrakinesis"));
                datos.setResurrection(rs.getBoolean("resurrection"));
                datos.setThe_force(rs.getBoolean("the_force"));
                datos.setMatter_absorption(rs.getBoolean("matter_absorption"));
                datos.setGrim_reaping(rs.getBoolean("grim_reaping"));
                datos.setVision_infrared(rs.getBoolean("vision_infrared"));
                datos.setVision_night(rs.getBoolean("vision_night"));
                datos.setWallcrawling(rs.getBoolean("wallcrawling"));
                datos.setSuper_breath(rs.getBoolean("super_breath"));
                datos.setWind_control(rs.getBoolean("wind_control"));
                datos.setMelting(rs.getBoolean("melting"));
                datos.setVision_microscopic(rs.getBoolean("vision_microscopic"));
                datos.setIntuitive_aptitude(rs.getBoolean("intuitive_aptitude"));
                datos.setRadiation_absorption(rs.getBoolean("radiation_absorption"));
                datos.setSub_mariner(rs.getBoolean("sub_mariner"));
                datos.setInvisibility(rs.getBoolean("invisibility"));
                datos.setMagic_resistance(rs.getBoolean("magic_resistance"));
                datos.setEnhanced_touch(rs.getBoolean("enhanced_touch"));
                datos.setTime_manipulation(rs.getBoolean("time_manipulation"));
                datos.setSonic_scream(rs.getBoolean("sonic_scream"));
                datos.setSonar(rs.getBoolean("sonar"));
                datos.setPlant_control(rs.getBoolean("plant_control"));
                datos.setMind_control_resistance(rs.getBoolean("mind_control_resistance"));
                datos.setMagnetism(rs.getBoolean("magnetism"));
                datos.setPortal_creation(rs.getBoolean("portal_creation"));
                datos.setOmnilingualism(rs.getBoolean("omnilingualism"));
                datos.setMolecular_combustion(rs.getBoolean("molecular_combustion"));
                datos.setTelepathy_resistance(rs.getBoolean("telepathy_resistance"));
                datos.setEnergy_resistance(rs.getBoolean("energy_resistance"));
                datos.setSpatial_awareness(rs.getBoolean("spatial_awareness"));
                datos.setToxin_and_disease_resistance(rs.getBoolean("toxin_and_disease_resistance"));
                datos.setVision_telescopic(rs.getBoolean("vision_telescopic"));
                datos.setRadiation_immunity(rs.getBoolean("radiation_immunity"));
                datos.setWater_control(rs.getBoolean("water_control"));
                datos.setBiokinesis(rs.getBoolean("biokinesis"));
                datos.setPower_cosmic(rs.getBoolean("power_cosmic"));
                datos.setChanging_armor(rs.getBoolean("changing_armor"));
                datos.setCloaking(rs.getBoolean("cloaking"));
                datos.setOmnipotent(rs.getBoolean("omnipotent"));
                datos.setIllumination(rs.getBoolean("illumination"));
                datos.setHair_manipulation(rs.getBoolean("hair_manipulation"));
                datos.setThirstokinesis(rs.getBoolean("thirstokinesis"));
                datos.setIllusions(rs.getBoolean("illusions"));
                datos.setEnhanced_smell(rs.getBoolean("enhanced_smell"));
                datos.setTime_travel(rs.getBoolean("time_travel"));
                datos.setNatural_weapons(rs.getBoolean("natural_weapons"));
                datos.setHeat_resistance(rs.getBoolean("heat_resistance"));
                datos.setEnergy_manipulation(rs.getBoolean("energy_manipulation"));
                datos.setBanish(rs.getBoolean("banish"));
                datos.setToxin_and_disease_control(rs.getBoolean("toxin_and_disease_control"));
                datos.setLevitation(rs.getBoolean("levitation"));
                datos.setEcholocation(rs.getBoolean("echolocation"));
                datos.setLight_control(rs.getBoolean("light_control"));
                datos.setRegeneration(rs.getBoolean("regeneration"));
                datos.setGravity_control(rs.getBoolean("gravity_control"));
                datos.setProbability_manipulation(rs.getBoolean("probability_manipulation"));
                datos.setMind_blast(rs.getBoolean("mind_blast"));
                datos.setPower_suit(rs.getBoolean("power_suit"));
                datos.setGliding(rs.getBoolean("gliding"));
                datos.setHeat_generation(rs.getBoolean("adaptation"));
                datos.setHeat_generation(rs.getBoolean("heat_generation"));
                datos.setMolecular_manipulation(rs.getBoolean("molecular_manipulation"));
                datos.setEnhanced_sight(rs.getBoolean("enhanced_sight"));
                datos.setIntangibility(rs.getBoolean("intangibility"));
                datos.setNatural_armor(rs.getBoolean("natural_armor"));
                datos.setAnimal_control(rs.getBoolean("animal_control"));
                datos.setHypnokinesis(rs.getBoolean("hypnokinesis"));
                datos.setInsanity(rs.getBoolean("insanity"));
                datos.setNova_force(rs.getBoolean("nova_force"));
                datos.setEnhanced_hearing(rs.getBoolean("enhanced_hearing"));
                datos.setPower_absorption(rs.getBoolean("power_absorption"));
                datos.setFire_resistance(rs.getBoolean("fire_resistance"));
                datos.setMind_control(rs.getBoolean("mind_control"));
                datos.setPrecognition(rs.getBoolean("precognition"));
                datos.setAnimation(rs.getBoolean("animation"));
                datos.setSeismic_power(rs.getBoolean("seismic_power"));
                datos.setPhotographic_reflexes(rs.getBoolean("photographic_reflexes"));
                datos.setTechnopath_cyberpath(rs.getBoolean("technopath_cyberpath"));
                datos.setElemental_transmogrification(rs.getBoolean("elemental_transmogrification"));
                datos.setSubstance_secretion(rs.getBoolean("substance_secretion"));
                datos.setElasticity(rs.getBoolean("elasticity"));
                datos.setPsionic_powers(rs.getBoolean("psionic_powers"));
                datos.setRadiation_control(rs.getBoolean("radiation_control"));
                datos.setPower_nullifier(rs.getBoolean("power_nullifier"));
                datos.setEmpathy(rs.getBoolean("empathy"));
                datos.setAnti_gravity(rs.getBoolean("anti_gravity"));
                datos.setSelf_sustenance(rs.getBoolean("self_sustenance"));
                datos.setForce_fields(rs.getBoolean("force_fields"));
                datos.setEnergy_constructs(rs.getBoolean("energy_constructs"));
                datos.setInvulnerability(rs.getBoolean("invulnerability"));
                datos.setReflexes(rs.getBoolean("reflexes"));
                datos.setEnhanced_memory(rs.getBoolean("enhanced_memory"));
                datos.setSummoning(rs.getBoolean("summoning"));
                datos.setProjection(rs.getBoolean("projection"));
                datos.setFire_control(rs.getBoolean("fire_control"));
                datos.setElectrical_transport(rs.getBoolean("electrical_transport"));
                datos.setAstral_projection(rs.getBoolean("astral_projection"));
                datos.setPhasing(rs.getBoolean("phasing"));
                datos.setElement_control(rs.getBoolean("element_control"));
                datos.setCamouflage(rs.getBoolean("camouflage"));
                datos.setImmortality(rs.getBoolean("immortality"));
                datos.setPeak_human_condition(rs.getBoolean("peak_human_condition"));
                datos.setShapeshifting(rs.getBoolean("shapeshifting"));
                datos.setPower_sense(rs.getBoolean("power_sense"));
                datos.setDimensional_travel(rs.getBoolean("dimensional_travel"));
                datos.setClairvoyance(rs.getBoolean("clairvoyance"));
                datos.setJump(rs.getBoolean("jump"));
                datos.setHyperkinesis(rs.getBoolean("hyperkinesis"));
                datos.setMagic(rs.getBoolean("magic"));
                datos.setEnergy_beams(rs.getBoolean("energy_beams"));
                datos.setTelekinesis(rs.getBoolean("telekinesis"));
                datos.setEnhanced_senses(rs.getBoolean("enhanced_senses"));
                datos.setTeleportation(rs.getBoolean("teleportation"));
                datos.setDeath_touch(rs.getBoolean("death_touch"));
                datos.setDarkforce_manipulation(rs.getBoolean("darkforce_manipulation"));
                datos.setElectrokinesis(rs.getBoolean("electrokinesis"));
                datos.setWeapon_based_powers(rs.getBoolean("weapon_based_powers"));
                datos.setAnimal_oriented_powers(rs.getBoolean("animal_oriented_powers"));
                datos.setPossession(rs.getBoolean("possession"));
                datos.setSuper_speed(rs.getBoolean("super_speed"));
                datos.setOmnitrix(rs.getBoolean("omnitrix"));
                datos.setDexterity(rs.getBoolean("dexterity"));
                datos.setAudio_control(rs.getBoolean("audio_control"));
                datos.setAstral_travel(rs.getBoolean("astral_travel"));
                datos.setStamina(rs.getBoolean("stamina"));
                datos.setDensity_control(rs.getBoolean("density_control"));
                datos.setSize_changing(rs.getBoolean("size_changing"));
                datos.setDuplication(rs.getBoolean("duplication"));
                datos.setEnergy_blasts(rs.getBoolean("energy_blasts"));
                datos.setEnergy_armor(rs.getBoolean("energy_armor"));
                datos.setTelepathy(rs.getBoolean("telepathy"));
                datos.setCryokinesis(rs.getBoolean("cryokinesis"));
                datos.setSuper_strength(rs.getBoolean("super_strength"));
                datos.setIntelligence(rs.getBoolean("intelligence"));
                datos.setLongevity(rs.getBoolean("longevity"));
                datos.setAnimal_attributes(rs.getBoolean("animal_attributes"));
                datos.setPower_augmentation(rs.getBoolean("power_augmentation"));
                datos.setWeapons_master(rs.getBoolean("weapons_master"));
                datos.setMarksmanship(rs.getBoolean("marksmanship"));
                datos.setUnderwater_breathing(rs.getBoolean("underwater_breathing"));
                datos.setDanger_sense(rs.getBoolean("danger_sense"));
                datos.setFlight(rs.getBoolean("flight"));
                datos.setEnergy_absorption(rs.getBoolean("energy_absorption"));
                datos.setStealth(rs.getBoolean("stealth"));
                datos.setDurability(rs.getBoolean("durability"));
                datos.setCold_resistance(rs.getBoolean("cold_resistance"));
                datos.setDimensional_awareness(rs.getBoolean("dimensional_awareness"));
                datos.setLantern_power_ring(rs.getBoolean("lantern_power_ring"));
                datos.setAccelerated_healing(rs.getBoolean("accelerated_healing"));
                datos.setAgility(rs.getBoolean("agility"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }
}
