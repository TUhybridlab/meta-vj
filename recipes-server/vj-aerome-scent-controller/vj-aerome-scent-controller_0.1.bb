DESCRIPTION = "Aerome Scent Controller"
HOMEPAGE = "jumpcu.be"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=834adb3f7384a82927b71c503635ceaf"

SRC_URI = "git://github.com/j-be/vj-aerome-scent-controller.git;user=git;protocol=ssh"

RDEPENDS_${PN} = "python \
                  python-logging \
                  python-threading \
                  python-flask \
                  python-socketio \
                  python-engineio \
                  python-gevent \
                  python-gevent-websocket \
                  python-flask-socketio \
                  rpi-gpio \
                  python-modules \
"
#                  python-recordclass

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEST_DIR = "/opt/vj-aerome-scent-controller"

# Package Revision, Update this whenever you change the recipe.
PR = "r6"

inherit update-rc.d

do_install () {
  install -d ${D}${DEST_DIR}

  install -d ${D}${DEST_DIR}/static
  cp -a ${S}/static/* ${D}${DEST_DIR}/static/

  install -m 0555 ${S}/aerome_scent_control_server.py ${D}${DEST_DIR}
  install -m 0555 ${S}/gpio_stinkomat_6000_controller.py ${D}${DEST_DIR}
  install -m 0444 ${S}/log.ini ${D}${DEST_DIR}

  install -d ${D}${sysconfdir}/init.d
  install -m 0755 ${S}/vj-aerome-scent-controller.init ${D}${sysconfdir}/init.d/vj-aerome-scent-controller

  chown -R root:root ${D}${DEST_DIR}
}

FILES_${PN} += "${DEST_DIR}/* ${DEST_DIR}/*/* ${DEST_DIR}/*/*/*"

INITSCRIPT_NAME = "vj-aerome-scent-controller"
INITSCRIPT_PARAMS = "defaults 92 20"

# Avoid splitting the package
PKG_SPLIT_INHIBIT="1"
