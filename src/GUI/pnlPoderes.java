/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import codigo.Consultas;
import database.DBConexion;
import java.sql.Connection;
import objetos.Poderes;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gara8
 */
public class pnlPoderes extends javax.swing.JPanel {

    Consultas consulta = new Consultas();
    DBConexion conexion = new DBConexion();
    private Connection connection = null;

    public pnlPoderes() {
        initComponents();
        mostrarDatosCombo();
        
        String nombre = (String) cmbSuperHeroe.getSelectedItem();
        Poderes poderes = consulta.cargarUnSuperHeroePoder(nombre);
        txt167.setText(String.valueOf(poderes.isOmniscient()));
        txt166.setText(String.valueOf(poderes.isOmnipresent()));
        txt165.setText(String.valueOf(poderes.isVision_cryo()));
        txt164.setText(String.valueOf(poderes.isMolecular_dissipation()));
        txt163.setText(String.valueOf(poderes.isPhoenix_force()));
        txt162.setText(String.valueOf(poderes.isSpeed_force()));
        txt161.setText(String.valueOf(poderes.isSymbiote_costume()));
        txt160.setText(String.valueOf(poderes.isOdin_force()));
        txt159.setText(String.valueOf(poderes.isReality_warping()));
        txt158.setText(String.valueOf(poderes.isWeb_creation()));
        txt157.setText(String.valueOf(poderes.isVision_thermal()));
        txt156.setText(String.valueOf(poderes.isVision_x_ray()));
        txt155.setText(String.valueOf(poderes.isWeather_control()));
        txt154.setText(String.valueOf(poderes.isQwardian_power_ring()));
        txt153.setText(String.valueOf(poderes.isRadar_sense()));
        txt152.setText(String.valueOf(poderes.isVitakinesis()));
        txt151.setText(String.valueOf(poderes.isVision_heat()));
        txt150.setText(String.valueOf(poderes.isTerrakinesis()));
        txt149.setText(String.valueOf(poderes.isResurrection()));
        txt148.setText(String.valueOf(poderes.isThe_force()));
        txt147.setText(String.valueOf(poderes.isMatter_absorption()));
        txt146.setText(String.valueOf(poderes.isGrim_reaping()));
        txt145.setText(String.valueOf(poderes.isVision_infrared()));
        txt144.setText(String.valueOf(poderes.isVision_night()));
        txt143.setText(String.valueOf(poderes.isWallcrawling()));
        txt142.setText(String.valueOf(poderes.isSuper_breath()));
        txt141.setText(String.valueOf(poderes.isWind_control()));
        txt140.setText(String.valueOf(poderes.isMelting()));
        txt139.setText(String.valueOf(poderes.isVision_microscopic()));
        txt138.setText(String.valueOf(poderes.isIntuitive_aptitude()));
        txt137.setText(String.valueOf(poderes.isRadiation_absorption()));
        txt136.setText(String.valueOf(poderes.isSub_mariner()));
        txt135.setText(String.valueOf(poderes.isInvisibility()));
        txt134.setText(String.valueOf(poderes.isMagic_resistance()));
        txt133.setText(String.valueOf(poderes.isEnhanced_touch()));
        txt132.setText(String.valueOf(poderes.isTime_manipulation()));
        txt131.setText(String.valueOf(poderes.isSonic_scream()));
        txt130.setText(String.valueOf(poderes.isSonar()));
        txt129.setText(String.valueOf(poderes.isPlant_control()));
        txt128.setText(String.valueOf(poderes.isMind_control_resistance()));
        txt127.setText(String.valueOf(poderes.isMagnetism()));
        txt126.setText(String.valueOf(poderes.isPortal_creation()));
        txt125.setText(String.valueOf(poderes.isOmnilingualism()));
        txt124.setText(String.valueOf(poderes.isMolecular_combustion()));
        txt123.setText(String.valueOf(poderes.isTelepathy_resistance()));
        txt122.setText(String.valueOf(poderes.isEnergy_resistance()));
        txt121.setText(String.valueOf(poderes.isSpatial_awareness()));
        txt120.setText(String.valueOf(poderes.isToxin_and_disease_resistance()));
        txt119.setText(String.valueOf(poderes.isVision_telescopic()));
        txt118.setText(String.valueOf(poderes.isRadiation_immunity()));
        txt117.setText(String.valueOf(poderes.isWater_control()));
        txt116.setText(String.valueOf(poderes.isBiokinesis()));
        txt115.setText(String.valueOf(poderes.isPower_cosmic()));
        txt114.setText(String.valueOf(poderes.isChanging_armor()));
        txt113.setText(String.valueOf(poderes.isCloaking()));
        txt112.setText(String.valueOf(poderes.isOmnipotent()));
        txt111.setText(String.valueOf(poderes.isIllumination()));
        txt110.setText(String.valueOf(poderes.isHair_manipulation()));
        txt109.setText(String.valueOf(poderes.isThirstokinesis()));
        txt108.setText(String.valueOf(poderes.isIllusions()));
        txt107.setText(String.valueOf(poderes.isEnhanced_smell()));
        txt106.setText(String.valueOf(poderes.isTime_travel()));
        txt105.setText(String.valueOf(poderes.isNatural_weapons()));
        txt104.setText(String.valueOf(poderes.isHeat_resistance()));
        txt103.setText(String.valueOf(poderes.isEnergy_manipulation()));
        txt102.setText(String.valueOf(poderes.isBanish()));
        txt101.setText(String.valueOf(poderes.isToxin_and_disease_control()));
        txt100.setText(String.valueOf(poderes.isLevitation()));
        txt99.setText(String.valueOf(poderes.isEcholocation()));
        txt98.setText(String.valueOf(poderes.isLight_control()));
        txt97.setText(String.valueOf(poderes.isRegeneration()));
        txt96.setText(String.valueOf(poderes.isGravity_control()));
        txt95.setText(String.valueOf(poderes.isProbability_manipulation()));
        txt94.setText(String.valueOf(poderes.isMind_blast()));
        txt93.setText(String.valueOf(poderes.isPower_suit()));
        txt92.setText(String.valueOf(poderes.isGliding()));
        txt91.setText(String.valueOf(poderes.isAdaptation()));
        txt90.setText(String.valueOf(poderes.isHeat_generation()));
        txt89.setText(String.valueOf(poderes.isMolecular_manipulation()));
        txt88.setText(String.valueOf(poderes.isEnhanced_sight()));
        txt87.setText(String.valueOf(poderes.isIntangibility()));
        txt86.setText(String.valueOf(poderes.isNatural_armor()));
        txt85.setText(String.valueOf(poderes.isAnimal_control()));
        txt84.setText(String.valueOf(poderes.isHypnokinesis()));
        txt83.setText(String.valueOf(poderes.isInsanity()));
        txt82.setText(String.valueOf(poderes.isNova_force()));
        txt81.setText(String.valueOf(poderes.isEnhanced_hearing()));
        txt80.setText(String.valueOf(poderes.isPower_absorption()));
        txt79.setText(String.valueOf(poderes.isFire_resistance()));
        txt78.setText(String.valueOf(poderes.isMind_control()));
        txt77.setText(String.valueOf(poderes.isPrecognition()));
        txt76.setText(String.valueOf(poderes.isAnimation()));
        txt75.setText(String.valueOf(poderes.isSeismic_power()));
        txt74.setText(String.valueOf(poderes.isPhotographic_reflexes()));
        txt73.setText(String.valueOf(poderes.isTechnopath_cyberpath()));
        txt72.setText(String.valueOf(poderes.isElemental_transmogrification()));
        txt71.setText(String.valueOf(poderes.isSubstance_secretion()));
        txt70.setText(String.valueOf(poderes.isElasticity()));
        txt69.setText(String.valueOf(poderes.isPsionic_powers()));
        txt68.setText(String.valueOf(poderes.isRadiation_control()));
        txt67.setText(String.valueOf(poderes.isPower_nullifier()));
        txt66.setText(String.valueOf(poderes.isEmpathy()));
        txt65.setText(String.valueOf(poderes.isAnti_gravity()));
        txt64.setText(String.valueOf(poderes.isSelf_sustenance()));
        txt63.setText(String.valueOf(poderes.isForce_fields()));
        txt62.setText(String.valueOf(poderes.isEnergy_constructs()));
        txt61.setText(String.valueOf(poderes.isInvulnerability()));
        txt60.setText(String.valueOf(poderes.isReflexes()));
        txt59.setText(String.valueOf(poderes.isEnhanced_memory()));
        txt58.setText(String.valueOf(poderes.isSummoning()));
        txt57.setText(String.valueOf(poderes.isProjection()));
        txt56.setText(String.valueOf(poderes.isFire_control()));
        txt55.setText(String.valueOf(poderes.isElectrical_transport()));
        txt54.setText(String.valueOf(poderes.isAstral_projection()));
        txt53.setText(String.valueOf(poderes.isPhasing()));
        txt52.setText(String.valueOf(poderes.isElement_control()));
        txt51.setText(String.valueOf(poderes.isCamouflage()));
        txt50.setText(String.valueOf(poderes.isImmortality()));
        txt49.setText(String.valueOf(poderes.isPeak_human_condition()));
        txt48.setText(String.valueOf(poderes.isShapeshifting()));
        txt47.setText(String.valueOf(poderes.isPower_sense()));
        txt46.setText(String.valueOf(poderes.isDimensional_travel()));
        txt45.setText(String.valueOf(poderes.isClairvoyance()));
        txt44.setText(String.valueOf(poderes.isJump()));
        txt43.setText(String.valueOf(poderes.isHyperkinesis()));
        txt42.setText(String.valueOf(poderes.isMagic()));
        txt41.setText(String.valueOf(poderes.isEnergy_beams()));
        txt40.setText(String.valueOf(poderes.isTelekinesis()));
        txt39.setText(String.valueOf(poderes.isEnhanced_senses()));
        txt38.setText(String.valueOf(poderes.isTeleportation()));
        txt37.setText(String.valueOf(poderes.isDeath_touch()));
        txt36.setText(String.valueOf(poderes.isDarkforce_manipulation()));
        txt35.setText(String.valueOf(poderes.isElectrokinesis()));
        txt34.setText(String.valueOf(poderes.isWeapon_based_powers()));
        txt33.setText(String.valueOf(poderes.isAnimal_oriented_powers()));
        txt32.setText(String.valueOf(poderes.isPossession()));
        txt31.setText(String.valueOf(poderes.isSuper_speed()));
        txt30.setText(String.valueOf(poderes.isOmnitrix()));
        txt29.setText(String.valueOf(poderes.isDexterity()));
        txt28.setText(String.valueOf(poderes.isAudio_control()));
        txt27.setText(String.valueOf(poderes.isAstral_travel()));
        txt26.setText(String.valueOf(poderes.isStamina()));
        txt25.setText(String.valueOf(poderes.isDensity_control()));
        txt24.setText(String.valueOf(poderes.isSize_changing()));
        txt23.setText(String.valueOf(poderes.isDuplication()));
        txt22.setText(String.valueOf(poderes.isEnergy_blasts()));
        txt21.setText(String.valueOf(poderes.isEnergy_armor()));
        txt20.setText(String.valueOf(poderes.isTelepathy()));
        
        txt19.setText(String.valueOf(poderes.isCryokinesis()));
        txt18.setText(String.valueOf(poderes.isSuper_strength()));
        txt17.setText(String.valueOf(poderes.isIntelligence()));
        txt16.setText(String.valueOf(poderes.isLongevity()));
        txt15.setText(String.valueOf(poderes.isAnimal_attributes()));
        txt14.setText(String.valueOf(poderes.isPower_augmentation()));
        txt13.setText(String.valueOf(poderes.isWeapons_master()));
        txt12.setText(String.valueOf(poderes.isMarksmanship()));
        txt11.setText(String.valueOf(poderes.isUnderwater_breathing()));
        txt10.setText(String.valueOf(poderes.isDanger_sense()));
        txt9.setText(String.valueOf(poderes.isFlight()));
        txt8.setText(String.valueOf(poderes.isEnergy_absorption()));
        txt7.setText(String.valueOf(poderes.isStealth()));
        txt6.setText(String.valueOf(poderes.isDurability()));
        txt5.setText(String.valueOf(poderes.isCold_resistance()));
        txt4.setText(String.valueOf(poderes.isDimensional_awareness()));
        txt3.setText(String.valueOf(poderes.isLantern_power_ring()));
        txt2.setText(String.valueOf(poderes.isAccelerated_healing()));
        txt1.setText(String.valueOf(poderes.isAgility()));
    }

    public void mostrarDatosCombo() {
        cmbSuperHeroe.setModel(consulta.cargarNombresHeroesPoderes());
    }
    
    public void limpiarCampos() {
        txt167.setText("");
        txt166.setText("");
        txt165.setText("");
        txt164.setText("");
        txt163.setText("");
        txt162.setText("");
        txt161.setText("");
        txt160.setText("");
        txt159.setText("");
        txt158.setText("");
        txt157.setText("");
        txt156.setText("");
        txt155.setText("");
        txt154.setText("");
        txt153.setText("");
        txt152.setText("");
        txt151.setText("");
        txt150.setText("");
        txt149.setText("");
        txt148.setText("");
        txt147.setText("");
        txt146.setText("");
        txt145.setText("");
        txt144.setText("");
        txt143.setText("");
        txt142.setText("");
        txt141.setText("");
        txt140.setText("");
        txt139.setText("");
        txt138.setText("");
        txt137.setText("");
        txt136.setText("");
        txt135.setText("");
        txt134.setText("");
        txt133.setText("");
        txt132.setText("");
        txt131.setText("");
        txt130.setText("");
        txt129.setText("");
        txt128.setText("");
        txt127.setText("");
        txt126.setText("");
        txt125.setText("");
        txt124.setText("");
        txt123.setText("");
        txt122.setText("");
        txt121.setText("");
        txt120.setText("");
        txt119.setText("");
        txt118.setText("");
        txt117.setText("");
        txt116.setText("");
        txt115.setText("");
        txt114.setText("");
        txt113.setText("");
        txt112.setText("");
        txt111.setText("");
        txt110.setText("");
        txt109.setText("");
        txt108.setText("");
        txt107.setText("");
        txt106.setText("");
        txt105.setText("");
        txt104.setText("");
        txt103.setText("");
        txt102.setText("");
        txt101.setText("");
        txt100.setText("");
        txt99.setText("");
        txt98.setText("");
        txt97.setText("");
        txt96.setText("");
        txt95.setText("");
        txt94.setText("");
        txt93.setText("");
        txt92.setText("");
        txt91.setText("");
        txt90.setText("");
        txt89.setText("");
        txt88.setText("");
        txt87.setText("");
        txt86.setText("");
        txt85.setText("");
        txt84.setText("");
        txt83.setText("");
        txt82.setText("");
        txt81.setText("");
        txt80.setText("");
        txt79.setText("");
        txt78.setText("");
        txt77.setText("");
        txt76.setText("");
        txt75.setText("");
        txt74.setText("");
        txt73.setText("");
        txt72.setText("");
        txt71.setText("");
        txt70.setText("");
        txt69.setText("");
        txt68.setText("");
        txt67.setText("");
        txt66.setText("");
        txt65.setText("");
        txt64.setText("");
        txt63.setText("");
        txt62.setText("");
        txt61.setText("");
        txt60.setText("");
        txt59.setText("");
        txt58.setText("");
        txt57.setText("");
        txt56.setText("");
        txt55.setText("");
        txt54.setText("");
        txt53.setText("");
        txt52.setText("");
        txt51.setText("");
        txt50.setText("");
        txt49.setText("");
        txt48.setText("");
        txt47.setText("");
        txt46.setText("");
        txt45.setText("");
        txt44.setText("");
        txt43.setText("");
        txt42.setText("");
        txt41.setText("");
        txt40.setText("");
        txt39.setText("");
        txt38.setText("");
        txt37.setText("");
        txt36.setText("");
        txt35.setText("");
        txt34.setText("");
        txt33.setText("");
        txt32.setText("");
        txt31.setText("");
        txt30.setText("");
        txt29.setText("");
        txt28.setText("");
        txt27.setText("");
        txt26.setText("");
        txt25.setText("");
        txt24.setText("");
        txt23.setText("");
        txt22.setText("");
        txt21.setText("");
        txt20.setText("");
        txt19.setText("");
        txt18.setText("");
        txt17.setText("");
        txt16.setText("");
        txt15.setText("");
        txt14.setText("");
        txt13.setText("");
        txt12.setText("");
        txt11.setText("");
        txt10.setText("");
        txt9.setText("");
        txt8.setText("");
        txt7.setText("");
        txt6.setText("");
        txt5.setText("");
        txt4.setText("");
        txt3.setText("");
        txt2.setText("");
        txt1.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt91 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt92 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt93 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt94 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt97 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt98 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txt99 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txt100 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txt103 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txt104 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txt105 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt106 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txt109 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txt110 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txt111 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txt112 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txt115 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txt116 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txt117 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txt118 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txt121 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txt122 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txt123 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txt124 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txt126 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txt127 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txt128 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txt129 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txt132 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txt133 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txt134 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txt135 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txt138 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txt139 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txt140 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txt141 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txt144 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txt145 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txt146 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txt150 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txt151 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txt152 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txt153 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txt164 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txt165 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txt166 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        txt167 = new javax.swing.JTextField();
        txt163 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txt162 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txt161 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txt160 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txt159 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txt158 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txt157 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txt156 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txt154 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        txt155 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        txt147 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txt148 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txt149 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txt142 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        txt143 = new javax.swing.JTextField();
        txt136 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txt137 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        txt130 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        txt131 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        txt125 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txt119 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txt120 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txt113 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        txt114 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txt107 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        txt108 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        txt101 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txt102 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txt95 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        txt96 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        txt85 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        txt86 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        txt87 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        txt88 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        txt89 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txt90 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        txt79 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        txt80 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        txt81 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        txt82 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        txt83 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        txt84 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        txt73 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        txt74 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        txt75 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txt76 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txt77 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        txt78 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        txt67 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        txt68 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        txt69 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        txt70 = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txt71 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        txt72 = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        txt61 = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        txt62 = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        txt63 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        txt64 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        txt65 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        txt66 = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        txt55 = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        txt56 = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        txt57 = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        txt58 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        txt59 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        txt60 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        txt49 = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        txt50 = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        txt51 = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        txt52 = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        txt53 = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        txt54 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        txt43 = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        txt44 = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        txt45 = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        txt46 = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        txt47 = new javax.swing.JTextField();
        jLabel162 = new javax.swing.JLabel();
        txt48 = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        txt37 = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        txt38 = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        txt39 = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        txt40 = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        txt41 = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        txt42 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        txt31 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        txt32 = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        txt33 = new javax.swing.JTextField();
        jLabel172 = new javax.swing.JLabel();
        txt34 = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        txt35 = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        txt36 = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        txt25 = new javax.swing.JTextField();
        jLabel176 = new javax.swing.JLabel();
        txt26 = new javax.swing.JTextField();
        jLabel177 = new javax.swing.JLabel();
        txt27 = new javax.swing.JTextField();
        jLabel178 = new javax.swing.JLabel();
        txt28 = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        txt29 = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        txt30 = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        txt19 = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        txt20 = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        txt21 = new javax.swing.JTextField();
        jLabel184 = new javax.swing.JLabel();
        txt22 = new javax.swing.JTextField();
        jLabel185 = new javax.swing.JLabel();
        txt23 = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        txt24 = new javax.swing.JTextField();
        jLabel187 = new javax.swing.JLabel();
        txt13 = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        txt14 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        txt15 = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        txt16 = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        txt17 = new javax.swing.JTextField();
        jLabel192 = new javax.swing.JLabel();
        txt18 = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        jLabel194 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        jLabel196 = new javax.swing.JLabel();
        txt10 = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        txt11 = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        txt12 = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        cmbSuperHeroe = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setRequestFocusEnabled(false);

        jLabel34.setText("agility:");

        jLabel35.setText("accelerated_healing:");

        jLabel36.setText("lantern_power_ring:");

        jLabel37.setText("dimensional_awareness:");

        jLabel38.setText("adaptation:");

        jLabel39.setText("gliding:");

        jLabel40.setText("power_suit:");

        jLabel41.setText("mind_blast:");

        jLabel42.setText("regeneration:");

        jLabel43.setText("light_control:");

        jLabel44.setText("echolocation:");

        jLabel45.setText("levitation:");

        jLabel46.setText("energy_manipulation:");

        jLabel47.setText("heat_resistance:");

        jLabel48.setText("natural_weapons:");

        jLabel49.setText("time_travel:");

        jLabel50.setText("thirstokinesis:");

        jLabel51.setText("hair_manipulation:");

        jLabel52.setText("illumination:");

        jLabel53.setText("omnipotent:");

        jLabel54.setText("power_cosmic:");

        jLabel55.setText("biokinesis:");

        jLabel56.setText("water_control:");

        jLabel57.setText("radiation_immunity:");

        jLabel58.setText("spatial_awareness:");

        jLabel59.setText("energy_resistance:");

        jLabel60.setText("telepathy_resistance:");

        jLabel61.setText("molecular_combustion:");

        jLabel62.setText("portal_creation:");

        jLabel63.setText("magnetism:");

        jLabel64.setText("mind_control_resistance:");

        jLabel65.setText("plant_control:");

        jLabel66.setText("time_manipulation:");

        jLabel67.setText("enhanced_touch:");

        jLabel68.setText("magic_resistance:");

        jLabel69.setText("invisibility:");

        jLabel70.setText("intuitive_aptitude:");

        jLabel71.setText("vision_microscopic:");

        jLabel72.setText("melting:");

        jLabel73.setText("wind_control:");

        jLabel75.setText("vision_night:");

        jLabel76.setText("vision_infrared:");

        jLabel77.setText("grim_reaping:");

        jLabel78.setText("terrakinesis:");

        jLabel79.setText("vision_heat:");

        jLabel80.setText("vitakinesis:");

        jLabel81.setText("radar_sense:");

        jLabel82.setText("molecular_dissipation:");

        jLabel83.setText("vision_cryo:");

        jLabel84.setText("omnipresent:");

        jLabel85.setText("omniscient:");

        jLabel86.setText("phoenix_force:");

        jLabel87.setText("speed_force:");

        jLabel88.setText("symbiote_costume:");

        jLabel89.setText("odin_force:");

        jLabel90.setText("reality_warping:");

        jLabel91.setText("web_creation:");

        jLabel92.setText("vision_thermal:");

        jLabel93.setText("vision_x_ray:");

        jLabel94.setText("qwardian_power_ring:");

        jLabel95.setText("weather_control:");

        jLabel96.setText("matter_absorption:");

        jLabel97.setText("the_force:");

        jLabel98.setText("resurrection:");

        jLabel74.setText("super_breath:");

        jLabel99.setText("wallcrawling:");

        jLabel100.setText("sub_mariner:");

        jLabel101.setText("radiation_absorption:");

        jLabel102.setText("sonar:");

        jLabel103.setText("sonic_scream:");

        jLabel104.setText("omnilingualism:");

        jLabel105.setText("vision_telescopic:");

        jLabel106.setText("toxin_and_disease_resistance:");

        jLabel107.setText("cloaking:");

        jLabel108.setText("changing_armor:");

        jLabel109.setText("enhanced_smell:");

        jLabel110.setText("illusions:");

        jLabel111.setText("toxin_and_disease_control:");

        jLabel112.setText("banish:");

        jLabel113.setText("probability_manipulation:");

        jLabel114.setText("gravity_control:");

        jLabel115.setText("animal_control:");

        jLabel116.setText("natural_armor:");

        jLabel117.setText("intangibility:");

        jLabel118.setText("enhanced_sight:");

        jLabel119.setText("molecular_manipulation:");

        jLabel120.setText("heat_generation:");

        jLabel121.setText("fire_resistance:");

        jLabel122.setText("power_absorption:");

        jLabel123.setText("enhanced_hearing:");

        jLabel124.setText("nova_force:");

        jLabel125.setText("insanity:");

        jLabel126.setText("hypnokinesis:");

        jLabel127.setText("technopath_cyberpath:");

        jLabel128.setText("photographic_reflexes:");

        jLabel129.setText("seismic_power:");

        jLabel130.setText("animation:");

        jLabel131.setText("precognition:");

        jLabel132.setText("mind_control:");

        jLabel133.setText("power_nullifier:");

        jLabel134.setText("radiation_control:");

        jLabel135.setText("psionic_powers:");

        jLabel136.setText("elasticity:");

        jLabel137.setText("substance_secretion:");

        jLabel138.setText("elemental_transmogrification:");

        jLabel139.setText("invulnerability:");

        jLabel140.setText("energy_constructs:");

        jLabel141.setText("force_fields:");

        jLabel142.setText("self_sustenance:");

        jLabel143.setText("anti_gravity:");

        jLabel144.setText("empathy:");

        jLabel145.setText("electrical_transport:");

        jLabel146.setText("fire_control:");

        jLabel147.setText("projection:");

        jLabel148.setText("summoning:");

        jLabel149.setText("enhanced_memory:");

        jLabel150.setText("reflexes:");

        jLabel151.setText("peak_human_condition:");

        jLabel152.setText("immortality:");

        jLabel153.setText("camouflage:");

        jLabel154.setText("element_control:");

        jLabel155.setText("phasing:");

        jLabel156.setText("astral_projection:");

        jLabel157.setText("hyperkinesis:");

        jLabel158.setText("jump:");

        jLabel159.setText("clairvoyance:");

        jLabel160.setText("dimensional_travel:");

        jLabel161.setText("power_sense:");

        jLabel162.setText("shapeshifting:");

        jLabel163.setText("death_touch:");

        jLabel164.setText("teleportation:");

        jLabel165.setText("enhanced_senses:");

        jLabel166.setText("telekinesis:");

        jLabel167.setText("energy_beams:");

        jLabel168.setText("magic:");

        jLabel169.setText("super_speed:");

        jLabel170.setText("possession:");

        jLabel171.setText("animal_powers:");

        jLabel172.setText("weapon_based_powers:");

        jLabel173.setText("electrokinesis:");

        jLabel174.setText("darkforce_manipulation:");

        jLabel175.setText("density_control:");

        jLabel176.setText("stamina:");

        jLabel177.setText("astral_travel:");

        jLabel178.setText("audio_control:");

        jLabel179.setText("dexterity:");

        jLabel180.setText("omnitrix:");

        jLabel181.setText("cryokinesis:");

        jLabel182.setText("telepathy:");

        jLabel183.setText("energy_armor:");

        jLabel184.setText("energy_blasts:");

        jLabel185.setText("duplication:");

        jLabel186.setText("size_changing:");

        jLabel187.setText("weapons_master:");

        jLabel188.setText("power_augmentation:");

        jLabel189.setText("animal_attributes:");

        jLabel190.setText("longevity:");

        jLabel191.setText("intelligence:");

        jLabel192.setText("super_strength:");

        jLabel193.setText("stealth:");

        jLabel194.setText("energy_absorption:");

        jLabel195.setText("flight:");

        jLabel196.setText("danger_sense:");

        jLabel197.setText("underwater_breathing:");

        jLabel198.setText("marksmanship:");

        jLabel199.setText("cold_resistance:");

        jLabel200.setText("durability:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel199)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel200)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt91, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt92, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt93, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt94, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt95, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt96, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt97, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt98, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt99, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt100, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt101, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt102, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt103, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt104, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt105, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt106, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt107, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt108, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt109, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt110, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt111, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt112, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt113, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt114, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt115, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt116, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt117, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt118, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt119, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt120, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt121, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt122, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt123, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt124, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt125, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt126, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt127, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt128, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt129, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt130, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt131, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt132, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt133, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt134, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt135, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt136, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt137, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt138, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt139, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt140, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt141, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt142, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt143, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt150, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt151, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt152, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt153, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel94)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt154, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt155, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt162, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt163, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt164, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt165, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt166, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt167, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt156, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt157, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt158, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt159, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt160, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt161, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt144, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt145, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt146, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt147, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt148, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt149, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt85, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt86, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt87, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt88, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt89, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt90, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt79, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt80, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt81, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt82, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt83, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt84, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt73, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt74, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt75, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt76, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt77, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel132)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt78, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt67, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt68, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt69, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt70, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt71, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt72, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel139)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt61, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt62, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt63, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel142)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt64, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt65, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt66, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel145)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt56, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel147)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt57, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel148)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt58, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel149)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel150)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel151)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt51, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel154)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt52, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt53, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel156)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel162)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel165)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel166)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel169)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel170)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel174)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel176)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel178)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel180)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel181)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel182)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel183)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel185)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel187)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel188)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel189)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel191)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel194)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel195)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel196)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel198)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel199)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel200)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel193)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel194)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel195)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel196)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel197)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel198)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel187)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel188)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel189)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel190)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel191)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel192)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel181)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel182)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel183)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel184)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel185)
                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel186)
                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel175)
                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176)
                    .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel177)
                    .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel178)
                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel179)
                    .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel180)
                    .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel169)
                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel170)
                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel171)
                    .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel172)
                    .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel173)
                    .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel174)
                    .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel163)
                    .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel164)
                    .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel165)
                    .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel166)
                    .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel167)
                    .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168)
                    .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel158)
                    .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel159)
                    .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel160)
                    .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161)
                    .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel162)
                    .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151)
                    .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152)
                    .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel153)
                    .addComponent(txt51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154)
                    .addComponent(txt52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel155)
                    .addComponent(txt53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156)
                    .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel146)
                    .addComponent(txt56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147)
                    .addComponent(txt57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148)
                    .addComponent(txt58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149)
                    .addComponent(txt59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(txt61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140)
                    .addComponent(txt62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141)
                    .addComponent(txt63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142)
                    .addComponent(txt64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(txt65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel144)
                    .addComponent(txt66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(txt67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134)
                    .addComponent(txt68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135)
                    .addComponent(txt69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel136)
                    .addComponent(txt70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137)
                    .addComponent(txt71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138)
                    .addComponent(txt72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(txt73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128)
                    .addComponent(txt74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129)
                    .addComponent(txt75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addComponent(txt76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel131)
                    .addComponent(txt77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132)
                    .addComponent(txt78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(txt79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122)
                    .addComponent(txt80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123)
                    .addComponent(txt81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124)
                    .addComponent(txt82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(txt83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126)
                    .addComponent(txt84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(txt85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116)
                    .addComponent(txt86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117)
                    .addComponent(txt87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118)
                    .addComponent(txt88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119)
                    .addComponent(txt89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120)
                    .addComponent(txt90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txt92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txt93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txt94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addComponent(txt95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114)
                    .addComponent(txt96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel112)
                        .addComponent(txt102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel111)
                        .addComponent(txt101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(txt97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43)
                        .addComponent(txt98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44)
                        .addComponent(txt99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)
                        .addComponent(txt100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel110)
                        .addComponent(txt108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel109)
                        .addComponent(txt107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txt103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47)
                        .addComponent(txt104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48)
                        .addComponent(txt105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49)
                        .addComponent(txt106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel108)
                        .addComponent(txt114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel107)
                        .addComponent(txt113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(txt109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)
                        .addComponent(txt110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52)
                        .addComponent(txt111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53)
                        .addComponent(txt112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel106)
                        .addComponent(txt120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105)
                        .addComponent(txt119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(txt115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55)
                        .addComponent(txt116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56)
                        .addComponent(txt117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57)
                        .addComponent(txt118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel104)
                        .addComponent(txt125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(txt121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59)
                        .addComponent(txt122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60)
                        .addComponent(txt123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61)
                        .addComponent(txt124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel103)
                        .addComponent(txt131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel102)
                        .addComponent(txt130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(txt126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63)
                        .addComponent(txt127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64)
                        .addComponent(txt128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65)
                        .addComponent(txt129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel101)
                        .addComponent(txt137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel100)
                        .addComponent(txt136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(txt132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67)
                        .addComponent(txt133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68)
                        .addComponent(txt134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69)
                        .addComponent(txt135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel99)
                        .addComponent(txt143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74)
                        .addComponent(txt142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(txt138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71)
                        .addComponent(txt139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel72)
                        .addComponent(txt140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73)
                        .addComponent(txt141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel98)
                        .addComponent(txt149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel97)
                        .addComponent(txt148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel96)
                        .addComponent(txt147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel75)
                        .addComponent(txt144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel76)
                        .addComponent(txt145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77)
                        .addComponent(txt146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel95)
                        .addComponent(txt155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel94)
                        .addComponent(txt154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78)
                        .addComponent(txt150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79)
                        .addComponent(txt151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel80)
                        .addComponent(txt152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81)
                        .addComponent(txt153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txt158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90)
                    .addComponent(txt159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(txt160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88)
                    .addComponent(txt161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92)
                    .addComponent(txt157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(txt156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(txt164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(txt165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(txt166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addComponent(txt167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(txt163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(txt162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        cmbSuperHeroe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSuperHeroeItemStateChanged(evt);
            }
        });

        jLabel1.setText("Buscar Superheroe:");

        btnModificar.setText("Editar");
        btnModificar.setMaximumSize(new java.awt.Dimension(78, 32));
        btnModificar.setMinimumSize(new java.awt.Dimension(78, 32));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbSuperHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(512, 512, 512))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSuperHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSuperHeroeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSuperHeroeItemStateChanged
        limpiarCampos();
        String nombre = (String) cmbSuperHeroe.getSelectedItem();
        Poderes poderes = consulta.cargarUnSuperHeroePoder(nombre);
        txt167.setText(String.valueOf(poderes.isOmniscient()));
        txt166.setText(String.valueOf(poderes.isOmnipresent()));
        txt165.setText(String.valueOf(poderes.isVision_cryo()));
        txt164.setText(String.valueOf(poderes.isMolecular_dissipation()));
        txt163.setText(String.valueOf(poderes.isPhoenix_force()));
        txt162.setText(String.valueOf(poderes.isSpeed_force()));
        txt161.setText(String.valueOf(poderes.isSymbiote_costume()));
        txt160.setText(String.valueOf(poderes.isOdin_force()));
        txt159.setText(String.valueOf(poderes.isReality_warping()));
        txt158.setText(String.valueOf(poderes.isWeb_creation()));
        txt157.setText(String.valueOf(poderes.isVision_thermal()));
        txt156.setText(String.valueOf(poderes.isVision_x_ray()));
        txt155.setText(String.valueOf(poderes.isWeather_control()));
        txt154.setText(String.valueOf(poderes.isQwardian_power_ring()));
        txt153.setText(String.valueOf(poderes.isRadar_sense()));
        txt152.setText(String.valueOf(poderes.isVitakinesis()));
        txt151.setText(String.valueOf(poderes.isVision_heat()));
        txt150.setText(String.valueOf(poderes.isTerrakinesis()));
        txt149.setText(String.valueOf(poderes.isResurrection()));
        txt148.setText(String.valueOf(poderes.isThe_force()));
        txt147.setText(String.valueOf(poderes.isMatter_absorption()));
        txt146.setText(String.valueOf(poderes.isGrim_reaping()));
        txt145.setText(String.valueOf(poderes.isVision_infrared()));
        txt144.setText(String.valueOf(poderes.isVision_night()));
        txt143.setText(String.valueOf(poderes.isWallcrawling()));
        txt142.setText(String.valueOf(poderes.isSuper_breath()));
        txt141.setText(String.valueOf(poderes.isWind_control()));
        txt140.setText(String.valueOf(poderes.isMelting()));
        txt139.setText(String.valueOf(poderes.isVision_microscopic()));
        txt138.setText(String.valueOf(poderes.isIntuitive_aptitude()));
        txt137.setText(String.valueOf(poderes.isRadiation_absorption()));
        txt136.setText(String.valueOf(poderes.isSub_mariner()));
        txt135.setText(String.valueOf(poderes.isInvisibility()));
        txt134.setText(String.valueOf(poderes.isMagic_resistance()));
        txt133.setText(String.valueOf(poderes.isEnhanced_touch()));
        txt132.setText(String.valueOf(poderes.isTime_manipulation()));
        txt131.setText(String.valueOf(poderes.isSonic_scream()));
        txt130.setText(String.valueOf(poderes.isSonar()));
        txt129.setText(String.valueOf(poderes.isPlant_control()));
        txt128.setText(String.valueOf(poderes.isMind_control_resistance()));
        txt127.setText(String.valueOf(poderes.isMagnetism()));
        txt126.setText(String.valueOf(poderes.isPortal_creation()));
        txt125.setText(String.valueOf(poderes.isOmnilingualism()));
        txt124.setText(String.valueOf(poderes.isMolecular_combustion()));
        txt123.setText(String.valueOf(poderes.isTelepathy_resistance()));
        txt122.setText(String.valueOf(poderes.isEnergy_resistance()));
        txt121.setText(String.valueOf(poderes.isSpatial_awareness()));
        txt120.setText(String.valueOf(poderes.isToxin_and_disease_resistance()));
        txt119.setText(String.valueOf(poderes.isVision_telescopic()));
        txt118.setText(String.valueOf(poderes.isRadiation_immunity()));
        txt117.setText(String.valueOf(poderes.isWater_control()));
        txt116.setText(String.valueOf(poderes.isBiokinesis()));
        txt115.setText(String.valueOf(poderes.isPower_cosmic()));
        txt114.setText(String.valueOf(poderes.isChanging_armor()));
        txt113.setText(String.valueOf(poderes.isCloaking()));
        txt112.setText(String.valueOf(poderes.isOmnipotent()));
        txt111.setText(String.valueOf(poderes.isIllumination()));
        txt110.setText(String.valueOf(poderes.isHair_manipulation()));
        txt109.setText(String.valueOf(poderes.isThirstokinesis()));
        txt108.setText(String.valueOf(poderes.isIllusions()));
        txt107.setText(String.valueOf(poderes.isEnhanced_smell()));
        txt106.setText(String.valueOf(poderes.isTime_travel()));
        txt105.setText(String.valueOf(poderes.isNatural_weapons()));
        txt104.setText(String.valueOf(poderes.isHeat_resistance()));
        txt103.setText(String.valueOf(poderes.isEnergy_manipulation()));
        txt102.setText(String.valueOf(poderes.isBanish()));
        txt101.setText(String.valueOf(poderes.isToxin_and_disease_control()));
        txt100.setText(String.valueOf(poderes.isLevitation()));
        txt99.setText(String.valueOf(poderes.isEcholocation()));
        txt98.setText(String.valueOf(poderes.isLight_control()));
        txt97.setText(String.valueOf(poderes.isRegeneration()));
        txt96.setText(String.valueOf(poderes.isGravity_control()));
        txt95.setText(String.valueOf(poderes.isProbability_manipulation()));
        txt94.setText(String.valueOf(poderes.isMind_blast()));
        txt93.setText(String.valueOf(poderes.isPower_suit()));
        txt92.setText(String.valueOf(poderes.isGliding()));
        txt91.setText(String.valueOf(poderes.isAdaptation()));
        txt90.setText(String.valueOf(poderes.isHeat_generation()));
        txt89.setText(String.valueOf(poderes.isMolecular_manipulation()));
        txt88.setText(String.valueOf(poderes.isEnhanced_sight()));
        txt87.setText(String.valueOf(poderes.isIntangibility()));
        txt86.setText(String.valueOf(poderes.isNatural_armor()));
        txt85.setText(String.valueOf(poderes.isAnimal_control()));
        txt84.setText(String.valueOf(poderes.isHypnokinesis()));
        txt83.setText(String.valueOf(poderes.isInsanity()));
        txt82.setText(String.valueOf(poderes.isNova_force()));
        txt81.setText(String.valueOf(poderes.isEnhanced_hearing()));
        txt80.setText(String.valueOf(poderes.isPower_absorption()));
        txt79.setText(String.valueOf(poderes.isFire_resistance()));
        txt78.setText(String.valueOf(poderes.isMind_control()));
        txt77.setText(String.valueOf(poderes.isPrecognition()));
        txt76.setText(String.valueOf(poderes.isAnimation()));
        txt75.setText(String.valueOf(poderes.isSeismic_power()));
        txt74.setText(String.valueOf(poderes.isPhotographic_reflexes()));
        txt73.setText(String.valueOf(poderes.isTechnopath_cyberpath()));
        txt72.setText(String.valueOf(poderes.isElemental_transmogrification()));
        txt71.setText(String.valueOf(poderes.isSubstance_secretion()));
        txt70.setText(String.valueOf(poderes.isElasticity()));
        txt69.setText(String.valueOf(poderes.isPsionic_powers()));
        txt68.setText(String.valueOf(poderes.isRadiation_control()));
        txt67.setText(String.valueOf(poderes.isPower_nullifier()));
        txt66.setText(String.valueOf(poderes.isEmpathy()));
        txt65.setText(String.valueOf(poderes.isAnti_gravity()));
        txt64.setText(String.valueOf(poderes.isSelf_sustenance()));
        txt63.setText(String.valueOf(poderes.isForce_fields()));
        txt62.setText(String.valueOf(poderes.isEnergy_constructs()));
        txt61.setText(String.valueOf(poderes.isInvulnerability()));
        txt60.setText(String.valueOf(poderes.isReflexes()));
        txt59.setText(String.valueOf(poderes.isEnhanced_memory()));
        txt58.setText(String.valueOf(poderes.isSummoning()));
        txt57.setText(String.valueOf(poderes.isProjection()));
        txt56.setText(String.valueOf(poderes.isFire_control()));
        txt55.setText(String.valueOf(poderes.isElectrical_transport()));
        txt54.setText(String.valueOf(poderes.isAstral_projection()));
        txt53.setText(String.valueOf(poderes.isPhasing()));
        txt52.setText(String.valueOf(poderes.isElement_control()));
        txt51.setText(String.valueOf(poderes.isCamouflage()));
        txt50.setText(String.valueOf(poderes.isImmortality()));
        txt49.setText(String.valueOf(poderes.isPeak_human_condition()));
        txt48.setText(String.valueOf(poderes.isShapeshifting()));
        txt47.setText(String.valueOf(poderes.isPower_sense()));
        txt46.setText(String.valueOf(poderes.isDimensional_travel()));
        txt45.setText(String.valueOf(poderes.isClairvoyance()));
        txt44.setText(String.valueOf(poderes.isJump()));
        txt43.setText(String.valueOf(poderes.isHyperkinesis()));
        txt42.setText(String.valueOf(poderes.isMagic()));
        txt41.setText(String.valueOf(poderes.isEnergy_beams()));
        txt40.setText(String.valueOf(poderes.isTelekinesis()));
        txt39.setText(String.valueOf(poderes.isEnhanced_senses()));
        txt38.setText(String.valueOf(poderes.isTeleportation()));
        txt37.setText(String.valueOf(poderes.isDeath_touch()));
        txt36.setText(String.valueOf(poderes.isDarkforce_manipulation()));
        txt35.setText(String.valueOf(poderes.isElectrokinesis()));
        txt34.setText(String.valueOf(poderes.isWeapon_based_powers()));
        txt33.setText(String.valueOf(poderes.isAnimal_oriented_powers()));
        txt32.setText(String.valueOf(poderes.isPossession()));
        txt31.setText(String.valueOf(poderes.isSuper_speed()));
        txt30.setText(String.valueOf(poderes.isOmnitrix()));
        txt29.setText(String.valueOf(poderes.isDexterity()));
        txt28.setText(String.valueOf(poderes.isAudio_control()));
        txt27.setText(String.valueOf(poderes.isAstral_travel()));
        txt26.setText(String.valueOf(poderes.isStamina()));
        txt25.setText(String.valueOf(poderes.isDensity_control()));
        txt24.setText(String.valueOf(poderes.isSize_changing()));
        txt23.setText(String.valueOf(poderes.isDuplication()));
        txt22.setText(String.valueOf(poderes.isEnergy_blasts()));
        txt21.setText(String.valueOf(poderes.isEnergy_armor()));
        txt20.setText(String.valueOf(poderes.isTelepathy()));
        txt19.setText(String.valueOf(poderes.isCryokinesis()));
        txt18.setText(String.valueOf(poderes.isSuper_strength()));
        txt17.setText(String.valueOf(poderes.isIntelligence()));
        txt16.setText(String.valueOf(poderes.isLongevity()));
        txt15.setText(String.valueOf(poderes.isAnimal_attributes()));
        txt14.setText(String.valueOf(poderes.isPower_augmentation()));
        txt13.setText(String.valueOf(poderes.isWeapons_master()));
        txt12.setText(String.valueOf(poderes.isMarksmanship()));
        txt11.setText(String.valueOf(poderes.isUnderwater_breathing()));
        txt10.setText(String.valueOf(poderes.isDanger_sense()));
        txt9.setText(String.valueOf(poderes.isFlight()));
        txt8.setText(String.valueOf(poderes.isEnergy_absorption()));
        txt7.setText(String.valueOf(poderes.isStealth()));
        txt6.setText(String.valueOf(poderes.isDurability()));
        txt5.setText(String.valueOf(poderes.isCold_resistance()));
        txt4.setText(String.valueOf(poderes.isDimensional_awareness()));
        txt3.setText(String.valueOf(poderes.isLantern_power_ring()));
        txt2.setText(String.valueOf(poderes.isAccelerated_healing()));
        txt1.setText(String.valueOf(poderes.isAgility()));
    }//GEN-LAST:event_cmbSuperHeroeItemStateChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String nombre = (String) cmbSuperHeroe.getSelectedItem();
            connection = conexion.Conexion();
            String sql = "UPDATE poderes SET reality_warping = ?, odin_force = ?, symbiote_costume = ?, speed_force = ?, phoenix_force = ?, molecular_dissipation = ?, vision_cryo = ?, omnipresent = ?, omniscient = ?, web_creation = ?, vision_thermal = ?, vision_x_ray = ?, weather_control = ?, qwardian_power_ring = ?, radar_sense = ?, vitakinesis = ?, vision_heat = ?, terrakinesis = ?, resurrection = ?, the_force = ?, matter_absorption = ?, grim_reaping = ?, vision_infrared = ?, vision_night = ?, wallcrawling = ?, super_breath = ?, wind_control = ?, melting = ?, vision_microscopic = ?, intuitive_aptitude = ?, radiation_absorption = ?, sub_mariner = ?, invisibility = ?, magic_resistance = ?, enhanced_touch = ?, time_manipulation = ?, sonic_scream = ?, sonar = ?, plant_control = ?, mind_control_resistance = ?, magnetism = ?, portal_creation = ?, omnilingualism = ?, molecular_combustion = ?, telepathy_resistance = ?, energy_resistance = ?, spatial_awareness = ?, toxin_and_disease_resistance = ?, vision_telescopic = ?, radiation_immunity = ?, water_control = ?, biokinesis = ?, power_cosmic = ?, changing_armor = ?, cloaking = ?, omnipotent = ?, illumination = ?, hair_manipulation = ?, thirstokinesis = ?, illusions = ?, enhanced_smell = ?, time_travel = ?, natural_weapons = ?, heat_resistance = ?, energy_manipulation = ?, banish = ?, toxin_and_disease_control = ?, levitation = ?, echolocation = ?, light_control = ?, regeneration = ?, gravity_control = ?, probability_manipulation = ?, mind_blast = ?, power_suit = ?, gliding = ?, adaptation = ?, heat_generation = ?, molecular_manipulation = ?, enhanced_sight = ?, intangibility = ?, natural_armor = ?, animal_control = ?, hypnokinesis = ?, insanity = ?, nova_force = ?, enhanced_hearing = ?, power_absorption = ?, fire_resistance = ?, mind_control = ?, precognition = ?, animation = ?, seismic_power = ?, photographic_reflexes = ?, technopath_cyberpath = ?, elemental_transmogrification = ?, substance_secretion = ?, elasticity = ?, psionic_powers = ?, radiation_control = ?, power_nullifier = ?, empathy = ?, anti_gravity = ?, self_sustenance = ?, force_fields = ?, energy_constructs = ?, invulnerability = ?, reflexes = ?, enhanced_memory = ?, summoning = ?, projection = ?, fire_control = ?, electrical_transport = ?, astral_projection = ?, phasing = ?, element_control = ?, camouflage = ?, immortality = ?, peak_human_condition = ?, shapeshifting = ?, power_sense = ?, dimensional_travel = ?, clairvoyance = ?, jump = ?, hyperkinesis = ?, magic = ?, energy_beams = ?, telekinesis = ?, enhanced_senses = ?, teleportation = ?, death_touch = ?, darkforce_manipulation = ?, electrokinesis = ?, weapon_based_powers = ?, animal_oriented_powers = ?, possession = ?, super_speed = ?, omnitrix = ?, dexterity = ?, audio_control = ?, astral_travel = ?, stamina = ?, density_control = ?, size_changing = ?, duplication = ?, energy_blasts = ?, energy_armor = ?, telepathy = ?, cryokinesis = ?, super_strength = ?, intelligence = ?, longevity = ?, animal_attributes = ?, power_augmentation = ?, weapons_master = ?, marksmanship = ?, underwater_breathing = ?, danger_sense = ?, flight = ?, energy_absorption = ?, stealth = ?, durability = ?, cold_resistance = ?, dimensional_awareness = ?, lantern_power_ring = ?, accelerated_healing = ?, agility = ? WHERE hero_names = '"+nombre+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setBoolean(1, Boolean.parseBoolean(txt159.getText()));
            ps.setBoolean(2, Boolean.parseBoolean(txt160.getText()));
            ps.setBoolean(3, Boolean.parseBoolean(txt161.getText()));
            ps.setBoolean(4, Boolean.parseBoolean(txt162.getText()));
            ps.setBoolean(5, Boolean.parseBoolean(txt163.getText()));
            ps.setBoolean(6, Boolean.parseBoolean(txt164.getText()));
            ps.setBoolean(7, Boolean.parseBoolean(txt165.getText()));
            ps.setBoolean(8, Boolean.parseBoolean(txt166.getText()));
            ps.setBoolean(9, Boolean.parseBoolean(txt167.getText()));
            ps.setBoolean(10, Boolean.parseBoolean(txt158.getText()));
            ps.setBoolean(11, Boolean.parseBoolean(txt157.getText()));
            ps.setBoolean(12, Boolean.parseBoolean(txt156.getText()));
            ps.setBoolean(13, Boolean.parseBoolean(txt155.getText()));
            ps.setBoolean(14, Boolean.parseBoolean(txt154.getText()));
            ps.setBoolean(15, Boolean.parseBoolean(txt153.getText()));
            ps.setBoolean(16, Boolean.parseBoolean(txt152.getText()));
            ps.setBoolean(17, Boolean.parseBoolean(txt151.getText()));
            ps.setBoolean(18, Boolean.parseBoolean(txt150.getText()));
            ps.setBoolean(19, Boolean.parseBoolean(txt149.getText()));
            ps.setBoolean(20, Boolean.parseBoolean(txt148.getText()));
            ps.setBoolean(21, Boolean.parseBoolean(txt147.getText()));
            ps.setBoolean(22, Boolean.parseBoolean(txt146.getText()));
            ps.setBoolean(23, Boolean.parseBoolean(txt145.getText()));
            ps.setBoolean(24, Boolean.parseBoolean(txt144.getText()));
            ps.setBoolean(25, Boolean.parseBoolean(txt143.getText()));
            ps.setBoolean(26, Boolean.parseBoolean(txt142.getText()));
            ps.setBoolean(27, Boolean.parseBoolean(txt141.getText()));
            ps.setBoolean(28, Boolean.parseBoolean(txt140.getText()));
            ps.setBoolean(29, Boolean.parseBoolean(txt139.getText()));
            ps.setBoolean(30, Boolean.parseBoolean(txt138.getText()));
            ps.setBoolean(31, Boolean.parseBoolean(txt137.getText()));
            ps.setBoolean(32, Boolean.parseBoolean(txt136.getText()));
            ps.setBoolean(33, Boolean.parseBoolean(txt135.getText()));
            ps.setBoolean(34, Boolean.parseBoolean(txt134.getText()));
            ps.setBoolean(35, Boolean.parseBoolean(txt133.getText()));
            ps.setBoolean(36, Boolean.parseBoolean(txt132.getText()));
            ps.setBoolean(37, Boolean.parseBoolean(txt131.getText()));
            ps.setBoolean(38, Boolean.parseBoolean(txt130.getText()));
            ps.setBoolean(39, Boolean.parseBoolean(txt129.getText()));
            ps.setBoolean(40, Boolean.parseBoolean(txt128.getText()));
            ps.setBoolean(41, Boolean.parseBoolean(txt127.getText()));
            ps.setBoolean(42, Boolean.parseBoolean(txt126.getText()));
            ps.setBoolean(43, Boolean.parseBoolean(txt125.getText()));
            ps.setBoolean(44, Boolean.parseBoolean(txt124.getText()));
            ps.setBoolean(45, Boolean.parseBoolean(txt123.getText()));
            ps.setBoolean(46, Boolean.parseBoolean(txt122.getText()));
            ps.setBoolean(47, Boolean.parseBoolean(txt121.getText()));
            ps.setBoolean(48, Boolean.parseBoolean(txt120.getText()));
            ps.setBoolean(49, Boolean.parseBoolean(txt119.getText()));
            ps.setBoolean(50, Boolean.parseBoolean(txt118.getText()));
            ps.setBoolean(51, Boolean.parseBoolean(txt117.getText()));
            ps.setBoolean(52, Boolean.parseBoolean(txt116.getText()));
            ps.setBoolean(53, Boolean.parseBoolean(txt115.getText()));
            ps.setBoolean(54, Boolean.parseBoolean(txt114.getText()));
            ps.setBoolean(55, Boolean.parseBoolean(txt113.getText()));
            ps.setBoolean(56, Boolean.parseBoolean(txt112.getText()));
            ps.setBoolean(57, Boolean.parseBoolean(txt111.getText()));
            ps.setBoolean(58, Boolean.parseBoolean(txt110.getText()));
            ps.setBoolean(59, Boolean.parseBoolean(txt109.getText()));
            ps.setBoolean(60, Boolean.parseBoolean(txt108.getText()));
            ps.setBoolean(61, Boolean.parseBoolean(txt107.getText()));
            ps.setBoolean(62, Boolean.parseBoolean(txt106.getText()));
            ps.setBoolean(63, Boolean.parseBoolean(txt105.getText()));
            ps.setBoolean(64, Boolean.parseBoolean(txt104.getText()));
            ps.setBoolean(65, Boolean.parseBoolean(txt103.getText()));
            ps.setBoolean(66, Boolean.parseBoolean(txt102.getText()));
            ps.setBoolean(67, Boolean.parseBoolean(txt101.getText()));
            ps.setBoolean(68, Boolean.parseBoolean(txt100.getText()));
            ps.setBoolean(69, Boolean.parseBoolean(txt99.getText()));
            ps.setBoolean(70, Boolean.parseBoolean(txt98.getText()));
            ps.setBoolean(71, Boolean.parseBoolean(txt97.getText()));
            ps.setBoolean(72, Boolean.parseBoolean(txt96.getText()));
            ps.setBoolean(73, Boolean.parseBoolean(txt95.getText()));
            ps.setBoolean(74, Boolean.parseBoolean(txt94.getText()));
            ps.setBoolean(75, Boolean.parseBoolean(txt93.getText()));
            ps.setBoolean(76, Boolean.parseBoolean(txt92.getText()));
            ps.setBoolean(77, Boolean.parseBoolean(txt91.getText()));
            ps.setBoolean(78, Boolean.parseBoolean(txt90.getText()));
            ps.setBoolean(79, Boolean.parseBoolean(txt89.getText()));
            ps.setBoolean(80, Boolean.parseBoolean(txt88.getText()));
            ps.setBoolean(81, Boolean.parseBoolean(txt87.getText()));
            ps.setBoolean(82, Boolean.parseBoolean(txt86.getText()));
            ps.setBoolean(83, Boolean.parseBoolean(txt85.getText()));
            ps.setBoolean(84, Boolean.parseBoolean(txt84.getText()));
            ps.setBoolean(85, Boolean.parseBoolean(txt83.getText()));
            ps.setBoolean(86, Boolean.parseBoolean(txt82.getText()));
            ps.setBoolean(87, Boolean.parseBoolean(txt81.getText()));
            ps.setBoolean(88, Boolean.parseBoolean(txt80.getText()));
            ps.setBoolean(89, Boolean.parseBoolean(txt79.getText()));
            ps.setBoolean(90, Boolean.parseBoolean(txt78.getText()));
            ps.setBoolean(91, Boolean.parseBoolean(txt77.getText()));
            ps.setBoolean(92, Boolean.parseBoolean(txt76.getText()));
            ps.setBoolean(93, Boolean.parseBoolean(txt75.getText()));
            ps.setBoolean(94, Boolean.parseBoolean(txt74.getText()));
            ps.setBoolean(95, Boolean.parseBoolean(txt73.getText()));
            ps.setBoolean(96, Boolean.parseBoolean(txt72.getText()));
            ps.setBoolean(97, Boolean.parseBoolean(txt71.getText()));
            ps.setBoolean(98, Boolean.parseBoolean(txt70.getText()));
            ps.setBoolean(99, Boolean.parseBoolean(txt69.getText()));
            ps.setBoolean(100, Boolean.parseBoolean(txt68.getText()));
            ps.setBoolean(101, Boolean.parseBoolean(txt67.getText()));
            ps.setBoolean(102, Boolean.parseBoolean(txt66.getText()));
            ps.setBoolean(103, Boolean.parseBoolean(txt65.getText()));
            ps.setBoolean(104, Boolean.parseBoolean(txt64.getText()));
            ps.setBoolean(105, Boolean.parseBoolean(txt63.getText()));
            ps.setBoolean(106, Boolean.parseBoolean(txt62.getText()));
            ps.setBoolean(107, Boolean.parseBoolean(txt61.getText()));
            ps.setBoolean(108, Boolean.parseBoolean(txt60.getText()));
            ps.setBoolean(109, Boolean.parseBoolean(txt59.getText()));
            ps.setBoolean(110, Boolean.parseBoolean(txt58.getText()));
            ps.setBoolean(111, Boolean.parseBoolean(txt57.getText()));
            ps.setBoolean(112, Boolean.parseBoolean(txt56.getText()));
            ps.setBoolean(113, Boolean.parseBoolean(txt55.getText()));
            ps.setBoolean(114, Boolean.parseBoolean(txt54.getText()));
            ps.setBoolean(115, Boolean.parseBoolean(txt53.getText()));
            ps.setBoolean(116, Boolean.parseBoolean(txt52.getText()));
            ps.setBoolean(117, Boolean.parseBoolean(txt51.getText()));
            ps.setBoolean(118, Boolean.parseBoolean(txt50.getText()));
            ps.setBoolean(119, Boolean.parseBoolean(txt49.getText()));
            ps.setBoolean(120, Boolean.parseBoolean(txt48.getText()));
            ps.setBoolean(121, Boolean.parseBoolean(txt47.getText()));
            ps.setBoolean(122, Boolean.parseBoolean(txt46.getText()));
            ps.setBoolean(123, Boolean.parseBoolean(txt45.getText()));
            ps.setBoolean(124, Boolean.parseBoolean(txt44.getText()));
            ps.setBoolean(125, Boolean.parseBoolean(txt43.getText()));
            ps.setBoolean(126, Boolean.parseBoolean(txt42.getText()));
            ps.setBoolean(127, Boolean.parseBoolean(txt41.getText()));
            ps.setBoolean(128, Boolean.parseBoolean(txt40.getText()));
            ps.setBoolean(129, Boolean.parseBoolean(txt39.getText()));
            ps.setBoolean(130, Boolean.parseBoolean(txt38.getText()));
            ps.setBoolean(131, Boolean.parseBoolean(txt37.getText()));
            ps.setBoolean(132, Boolean.parseBoolean(txt36.getText()));
            ps.setBoolean(133, Boolean.parseBoolean(txt35.getText()));
            ps.setBoolean(134, Boolean.parseBoolean(txt34.getText()));
            ps.setBoolean(135, Boolean.parseBoolean(txt33.getText()));
            ps.setBoolean(136, Boolean.parseBoolean(txt32.getText()));
            ps.setBoolean(137, Boolean.parseBoolean(txt31.getText()));
            ps.setBoolean(138, Boolean.parseBoolean(txt30.getText()));
            ps.setBoolean(139, Boolean.parseBoolean(txt29.getText()));
            ps.setBoolean(140, Boolean.parseBoolean(txt28.getText()));
            ps.setBoolean(141, Boolean.parseBoolean(txt27.getText()));
            ps.setBoolean(142, Boolean.parseBoolean(txt26.getText()));
            ps.setBoolean(143, Boolean.parseBoolean(txt25.getText()));
            ps.setBoolean(144, Boolean.parseBoolean(txt24.getText()));
            ps.setBoolean(145, Boolean.parseBoolean(txt23.getText()));
            ps.setBoolean(146, Boolean.parseBoolean(txt22.getText()));
            ps.setBoolean(147, Boolean.parseBoolean(txt21.getText()));
            ps.setBoolean(148, Boolean.parseBoolean(txt20.getText()));
            ps.setBoolean(149, Boolean.parseBoolean(txt19.getText()));
            ps.setBoolean(150, Boolean.parseBoolean(txt18.getText()));
            ps.setBoolean(151, Boolean.parseBoolean(txt17.getText()));
            ps.setBoolean(152, Boolean.parseBoolean(txt16.getText()));
            ps.setBoolean(153, Boolean.parseBoolean(txt15.getText()));
            ps.setBoolean(154, Boolean.parseBoolean(txt14.getText()));
            ps.setBoolean(155, Boolean.parseBoolean(txt13.getText()));
            ps.setBoolean(156, Boolean.parseBoolean(txt12.getText()));
            ps.setBoolean(157, Boolean.parseBoolean(txt11.getText()));
            ps.setBoolean(158, Boolean.parseBoolean(txt10.getText()));
            ps.setBoolean(159, Boolean.parseBoolean(txt9.getText()));
            ps.setBoolean(160, Boolean.parseBoolean(txt8.getText()));
            ps.setBoolean(161, Boolean.parseBoolean(txt7.getText()));
            ps.setBoolean(162, Boolean.parseBoolean(txt6.getText()));
            ps.setBoolean(163, Boolean.parseBoolean(txt5.getText()));
            ps.setBoolean(164, Boolean.parseBoolean(txt4.getText()));
            ps.setBoolean(165, Boolean.parseBoolean(txt3.getText()));
            ps.setBoolean(166, Boolean.parseBoolean(txt2.getText()));
            ps.setBoolean(167, Boolean.parseBoolean(txt1.getText()));
            ps.execute();
            ps.close();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Guardado correctamente!");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbSuperHeroe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt100;
    private javax.swing.JTextField txt101;
    private javax.swing.JTextField txt102;
    private javax.swing.JTextField txt103;
    private javax.swing.JTextField txt104;
    private javax.swing.JTextField txt105;
    private javax.swing.JTextField txt106;
    private javax.swing.JTextField txt107;
    private javax.swing.JTextField txt108;
    private javax.swing.JTextField txt109;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt110;
    private javax.swing.JTextField txt111;
    private javax.swing.JTextField txt112;
    private javax.swing.JTextField txt113;
    private javax.swing.JTextField txt114;
    private javax.swing.JTextField txt115;
    private javax.swing.JTextField txt116;
    private javax.swing.JTextField txt117;
    private javax.swing.JTextField txt118;
    private javax.swing.JTextField txt119;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt120;
    private javax.swing.JTextField txt121;
    private javax.swing.JTextField txt122;
    private javax.swing.JTextField txt123;
    private javax.swing.JTextField txt124;
    private javax.swing.JTextField txt125;
    private javax.swing.JTextField txt126;
    private javax.swing.JTextField txt127;
    private javax.swing.JTextField txt128;
    private javax.swing.JTextField txt129;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt130;
    private javax.swing.JTextField txt131;
    private javax.swing.JTextField txt132;
    private javax.swing.JTextField txt133;
    private javax.swing.JTextField txt134;
    private javax.swing.JTextField txt135;
    private javax.swing.JTextField txt136;
    private javax.swing.JTextField txt137;
    private javax.swing.JTextField txt138;
    private javax.swing.JTextField txt139;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt140;
    private javax.swing.JTextField txt141;
    private javax.swing.JTextField txt142;
    private javax.swing.JTextField txt143;
    private javax.swing.JTextField txt144;
    private javax.swing.JTextField txt145;
    private javax.swing.JTextField txt146;
    private javax.swing.JTextField txt147;
    private javax.swing.JTextField txt148;
    private javax.swing.JTextField txt149;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt150;
    private javax.swing.JTextField txt151;
    private javax.swing.JTextField txt152;
    private javax.swing.JTextField txt153;
    private javax.swing.JTextField txt154;
    private javax.swing.JTextField txt155;
    private javax.swing.JTextField txt156;
    private javax.swing.JTextField txt157;
    private javax.swing.JTextField txt158;
    private javax.swing.JTextField txt159;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt160;
    private javax.swing.JTextField txt161;
    private javax.swing.JTextField txt162;
    private javax.swing.JTextField txt163;
    private javax.swing.JTextField txt164;
    private javax.swing.JTextField txt165;
    private javax.swing.JTextField txt166;
    private javax.swing.JTextField txt167;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt42;
    private javax.swing.JTextField txt43;
    private javax.swing.JTextField txt44;
    private javax.swing.JTextField txt45;
    private javax.swing.JTextField txt46;
    private javax.swing.JTextField txt47;
    private javax.swing.JTextField txt48;
    private javax.swing.JTextField txt49;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txt51;
    private javax.swing.JTextField txt52;
    private javax.swing.JTextField txt53;
    private javax.swing.JTextField txt54;
    private javax.swing.JTextField txt55;
    private javax.swing.JTextField txt56;
    private javax.swing.JTextField txt57;
    private javax.swing.JTextField txt58;
    private javax.swing.JTextField txt59;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt60;
    private javax.swing.JTextField txt61;
    private javax.swing.JTextField txt62;
    private javax.swing.JTextField txt63;
    private javax.swing.JTextField txt64;
    private javax.swing.JTextField txt65;
    private javax.swing.JTextField txt66;
    private javax.swing.JTextField txt67;
    private javax.swing.JTextField txt68;
    private javax.swing.JTextField txt69;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt70;
    private javax.swing.JTextField txt71;
    private javax.swing.JTextField txt72;
    private javax.swing.JTextField txt73;
    private javax.swing.JTextField txt74;
    private javax.swing.JTextField txt75;
    private javax.swing.JTextField txt76;
    private javax.swing.JTextField txt77;
    private javax.swing.JTextField txt78;
    private javax.swing.JTextField txt79;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt80;
    private javax.swing.JTextField txt81;
    private javax.swing.JTextField txt82;
    private javax.swing.JTextField txt83;
    private javax.swing.JTextField txt84;
    private javax.swing.JTextField txt85;
    private javax.swing.JTextField txt86;
    private javax.swing.JTextField txt87;
    private javax.swing.JTextField txt88;
    private javax.swing.JTextField txt89;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txt90;
    private javax.swing.JTextField txt91;
    private javax.swing.JTextField txt92;
    private javax.swing.JTextField txt93;
    private javax.swing.JTextField txt94;
    private javax.swing.JTextField txt95;
    private javax.swing.JTextField txt96;
    private javax.swing.JTextField txt97;
    private javax.swing.JTextField txt98;
    private javax.swing.JTextField txt99;
    // End of variables declaration//GEN-END:variables
}
